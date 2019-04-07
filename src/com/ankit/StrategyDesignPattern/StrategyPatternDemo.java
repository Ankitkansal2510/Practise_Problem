package com.ankit.StrategyDesignPattern;

/*Strategy Pattern
In Strategy Pattern , class behaviour or its algortihm changes at runtime.This pattern comes under the behavioural 
design pattern.
In this pattern we create the object which represents the various strategy and the context object whose behaviour
varies as per its strategy*/

public class StrategyPatternDemo {

	public static void main(String[] args) {
		Context addcontext=new Context(new AddOperation());
		System.out.println("Adding operation: " +addcontext.executeStrategy(5, 10));
		
		Context subtractContext=new Context(new SubtractOpertaion());
		System.out.println("Subtract operation : " + subtractContext.executeStrategy(10, 5));
		
		Context multiplyContext=new Context(new MultiplyOperation());
		System.out.println("Multiply operation : " + multiplyContext.executeStrategy(5,10));
		

	}

}
