package com.ankit.Array_Problems;
interface Interfac
{
	public Sample get();
}

class Sample

{
	Sample()
	{
		System.out.println("Inside Sample constructor");
	}
}
public class ConstructorRefernceDemo {

	public static void main(String[] args) {
		
		Interfac i=Sample::new; //This will create the object of the Sample class using new keyword
		Sample s1=i.get();
		System.out.println(s1);

	}

}
