package com.ankit.FactoryDesignPattern;
/*
Factory Design pattern provides the best way to create the object.
This pattern comes under the creational design pattern.
In Factory design pattern we create the object without exposing the creation object to the client.
*/
public class FactoryPatternDemo {

	public static void main(String[] args) {
		ShapeFactory shapeFactory=new ShapeFactory();
		Shape shape1=shapeFactory.getShape("Circle");
		shape1.draw();
		
		Shape shape2=shapeFactory.getShape("Rectangle");
		shape2.draw();
		
		Shape shape3=shapeFactory.getShape("Square");
		shape3.draw();

	}

}
