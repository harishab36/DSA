package com.dsa.string;

public class ReverseString {
	
	public static void main(String a[]) {
		String name = "h";
		StringBuilder reverse = new StringBuilder();
		char[] reverseChars = new char[name.length()];
		for(int i=0;i<name.length();i++) {
			reverseChars[i] = name.charAt(name.length()-i-1);
		}
		
		reverse.append(reverseChars);
		System.out.println(reverse);
	
		byte[] nameBytes = name.getBytes();
		byte[] reverseByte = new byte[nameBytes.length];
		for(int k=0, j=nameBytes.length-1;j>=0;j--,k++) {
			reverseByte[k] = nameBytes[j];
		}
		
		reverse.append(reverseByte);
		System.out.println("Bytes "+reverse);

		StringBuffer reverBuffer = new StringBuffer(name);
		for (int i=0,j = name.length()-1;i<name.length()/2+1;i++,j--){
			if (i>j){
				break;
			}
			reverBuffer.setCharAt(i,name.charAt(j));
			reverBuffer.setCharAt(j,name.charAt(i));
		}
		System.out.print("Reverse ysubg buffer : "+reverBuffer);
	}
}
