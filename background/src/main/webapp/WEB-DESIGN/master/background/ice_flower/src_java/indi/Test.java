package indi;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String args[]){  
		/*The matrix of user and item, user field 0 means the user hadn't buy the item*/
		
		ColFlt aptest=new ColFlt(new int[][] {
				   new int[]{1,0,0,0,5},
				   new int[]{1,2,0,4,0},
				   new int[]{0,0,0,1,2},
				   new int[]{3,5,0,1,5},
				   new int[]{3,0,1,0,0} 
		}); 
	
		int item=aptest.getItems(1);
		System.out.println(item);
			
	}  
}
