package com.ankit.StrategyDesignPattern;

/*Strategy Design pattern

In Strategy Design Pattern , a class behaviour or its algorithm changes at run time.
This pattern comes under behavioural desing pattern

In strategy Pattern we create object which represents the various strategy and the context object whose 
behaviour varies as per its strategy*/

public interface Strategy {
	
	public int doOperation(int num1,int num2);

}
