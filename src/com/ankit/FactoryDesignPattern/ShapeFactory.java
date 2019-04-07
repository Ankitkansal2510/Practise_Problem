package com.ankit.FactoryDesignPattern;

public class ShapeFactory {
	
	public Shape getShape(String shape)
	{
		if(shape==null)
		{
			return null;
		}
		else if(shape.equalsIgnoreCase("circle"))
		{
			return new Circle();
		}
		else if (shape.equalsIgnoreCase("Rectangle"))
		{
			return new Rectangle();
		}
		else if (shape.equalsIgnoreCase("Square"))
		{
			return new Square();
		}
		return null;
		
	}

}
