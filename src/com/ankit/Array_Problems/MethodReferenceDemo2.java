package com.ankit.Array_Problems;

interface Interf1 {
	public void m1();
}

public class MethodReferenceDemo2 {

	public void m2() {
		System.out.println("Method Refernce Demo 2");
	}

	public static void main(String[] args) {
		MethodReferenceDemo2 m = new MethodReferenceDemo2();
		// Here m2 is not a static method so we are first creating the object of
		// the class and then using method reference

		Interf i = m::m2;
		i.m1();

	}

}
