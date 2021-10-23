/**
 * 
 */
package com.dsa.list;

/**
 * @author Harish
 *
 */
public class DemoSerialList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			SerialList<Integer> list = new SerialList<Integer>();
			
			int i =0;
			list.add(i);
			list.add(++i);
			list.add(++i);
			list.add(++i);
			list.add(++i);
			list.add(++i);
			list.add(++i);
			
			System.out.println(list);
			
			System.out.println("Element first "+list.get(0));
			
//			System.out.println("Last element "+list.get(3));
			
			list.remove(1);
			
			System.out.println("Size of the list "+list.size());
			
			System.out.println(list.get(1));
	}

}
