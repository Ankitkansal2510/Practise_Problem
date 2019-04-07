package com.ankit.FacadeDesignPattern;

/*Facade desing pattern hides the complexities of the system and provides the interface
to the client using which client can access the system*/

public class FacadeDemo {

	public static void main(String[] args) {
		ShapeMaker shapeMaker=new ShapeMaker();
		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();

	}

}
