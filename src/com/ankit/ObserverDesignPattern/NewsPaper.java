package com.ankit.ObserverDesignPattern;

public class NewsPaper implements Observer {

	@Override
	public void update(float interest) {
		System.out.println("Interest Rate updated :  " + interest);

	}

}
