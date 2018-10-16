package indi.ice;

import java.util.HashMap;
import java.util.Map.Entry;
/*
 * this class Provides a algorithm which called Collaborative recommendation algorithm
*/ 
public class ColFlt {
   private int [][] a; //user and item matrix
   private final static int userNumber=3 ; 
   private int []missItems;
   private HashMap<Integer,Double> userCon=new HashMap<Integer,Double>();  //store the confirmed user's similarity
   //调入矩阵
   public ColFlt(int[][] userAndItem) {
	   a=userAndItem;  
   }
   private  double aver(int u)
    {
    	double sum=0;
    	for(int ui:a[u])
    		sum+=ui;
    	return sum/a[u].length;
    }
   //return the similarity between two user
   private  double sim(int i,int j)
    {
    	double iAver,jAver,similarity=0;
    	double si,sj,sij;
    	si=sj=sij=0;
    	iAver=aver(i);
    	jAver=aver(j);
    	for(int k=0;k<a[0].length;k++)
    	{
    		sij+=(a[i][k]-iAver)*(a[j][k]-jAver);
    		si+=(a[i][k]-iAver)*(a[i][k]-iAver);
    		sj+=(a[j][k]-jAver)*(a[j][k]-jAver);
    	}
    	similarity=sij/Math.sqrt(si)/Math.sqrt(sj);
    	return similarity;
    }
   private  int[] getSimUsers(int u)
    {
	   int userPurTime=0,seq=0;
	   for(int t:a[u])
		   if(t==0) userPurTime++;
	   missItems=new int[a[u].length-userPurTime];
	   for(int t:a[u])
		   if(t!=0) missItems[seq++]=t;
	   for(int []ui:a)
		   for(int uic:ui)
			   if(uic==0) uic=3;
    	int[]users=new int[userNumber]; 
    	double items=-100;
    	HashMap<Integer,Double> userSim=new HashMap<Integer,Double>();
    	for(int i=0;i<a.length;i++) {
    		if(u!=i) userSim.put(i,sim(u,i));
    	}	
    	for(int k=0;k<userNumber;k++) {
    		double uScore=-100;int uKey=-1;
    		 for(Entry<Integer, Double> entry: userSim.entrySet()) {
    			 if(entry.getValue()>uScore) {uScore=entry.getValue();uKey=entry.getKey();}
    		 }
    		 userCon.put(uKey, userSim.remove(uKey)) ;
    		 users[k]=uKey;
    	}
    	return users;
    }
    public int getItems(int u)
    {
    	int users[]=getSimUsers(u);
    	HashMap<Integer,Double> uitem=new HashMap<Integer,Double>();
    	for(int i=0;i<missItems.length;i++) {
    		double ta=0,tb=0,uAver=aver(u);
    		for(int j=0;j<userNumber;j++)
    		{
    			ta+=userCon.get(users[j])*(a[users[j]][missItems[i]]-aver(users[j]));    			
    			tb+=Math.abs(userCon.get(users[j]));			
    		}
    		uitem.put(missItems[i], uAver+ta/tb); // means the score missing item  represent
    	}
    	int getItem=-1;double maxScore=-100;
    	//如果要改变推荐项数量，修改这里
    	//for……
    	for(Entry<Integer, Double> entry: uitem.entrySet() )
    	{
    		if(entry.getValue()>maxScore) {maxScore=entry.getValue();getItem=entry.getKey();}
    	}
    	return getItem;	
    }
}
