package com.dsa;

public class MethodReference {
	
	public void msg(String message) {
		System.out.println(message);
	}

	public static void main(String[] a) {
		MethodReference mr = new MethodReference();
		C c = mr::msg;
		c.m1("Good Morning..!!!!");
	}

}

@FunctionalInterface
interface C{
	public void m1(String msg);
}
