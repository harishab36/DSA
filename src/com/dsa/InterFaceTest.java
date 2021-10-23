package com.dsa;

public class InterFaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		b.m1();
		System.out.println("X = "+b.x);
	}

}

interface A{
	int x =1;
	public void m1();
}

class B implements A{

	int x = 2;
	
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("One");
	}
	
}