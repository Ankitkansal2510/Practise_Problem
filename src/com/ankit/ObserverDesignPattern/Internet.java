package com.ankit.ObserverDesignPattern;

public class Internet implements Observer {

	@Override
	public void update(float interest) {
		System.out.println("Updating interest rate on Internet : " + interest);

	}

}
