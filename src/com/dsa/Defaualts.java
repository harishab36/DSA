/**
 * 
 */
package com.dsa;

/**
 * @author Harish
 *
 */

interface DefInterface{
	default public void message() {
		System.out.println("hello..!!!!!");
	}
}

public class Defaualts implements DefInterface{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefInterface def = new DefInt();
		def.message();
	}

}

class DefInt extends Defaualts{
	
}
