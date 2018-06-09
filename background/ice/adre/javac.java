

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class javac {
    public static ArrayList<Integer>getad(){
        sort s[]=new sort[]{
                new sort(1,"desc1"),
                new sort(2,"desc2"),
                new sort(1,"desc3"),
                new sort(2,"desc4"),
        };
        ArrayList<sort> al=new ArrayList<sort>();
        ArrayList<Integer> ar=new ArrayList<Integer>();
        for (sort sort : s) {
            al.add(sort);
        }
        int j,i;
        i=(int)(Math.random()*al.size());
        j=(int)(Math.random()*al.size());
        while(al.get(i).comId==al.get(j).comId){
            j=(int)(Math.random()*al.size());
        }
       ar.add(i);ar.add(j);
       return ar;
    }
    public static void main(String args[])
    {
        ArrayList<Integer> result=getad();
        System.out.println(result.get(0));
        System.out.println(result.get(1));
    }
}
