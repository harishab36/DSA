package com.dsa; 

/**
 * 
 */

/**
 * @author Harish
 *
 */
public class PrintPairs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] list = {1,2,3,4,5};
		
		for(int i=0;i<list.length; i++) {
			for(int j=0;j<list.length;j++) {
			System.out.println(list[i]+":"+list[j]);
			}
		}
	}

}
