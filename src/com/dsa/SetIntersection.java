package com.dsa;

import java.util.Arrays;

public class SetIntersection {
	
	static int[] s1 = {0,1,2,3,4};
	static int[] s2 = {3,4,5,6,7};
	
	public static void main(String[] a) {
		
		SetIntersection s = new SetIntersection();
		int[] r = s.intersection(s1, s2);
		System.out.println(Arrays.toString(r));
		
		int[] res = s.union(s1, s2);
		System.out.println(Arrays.toString(res));
	}
	
	public int[] intersection(int[] s1,int[] s2) {
		int[] result = new int[s1.length > s2.length?s2.length:s1.length];
		
		int k=0;
		for(int i=0;i<s1.length;i++) {
			for(int j=0;j<s2.length;j++) {
				if(s1[i] == s2[j]) {
					result[k] = s1[i];
					k++;
				}
			}
		}
		
		return result;
	}
	
	public int[] union(int[] s1,int[] s2) {
		int[] result = new int[s1.length+s2.length];
		
		for(int i=0;i<s1.length;i++) {
			result[i] = s1[i];
		}
		
		int x = s1.length;
		
		for(int j=0;j<s2.length;j++) {
			boolean present = false;
			for(int k=0;k<result.length;k++) {
				if(s2[j] == result[k]) {
					present = true;
					break;
				}
			}
			if(!present) {
				result[x] = s2[j];
				x++;
			}
		}
		
		return result;
	}

}
