package com.ankit.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Loan implements Subject {

	private List<Observer> list=new ArrayList<>();
	
	private String type;
	private float interest;
	private String bank;
	
	
	
	public Loan(String type, float interest, String bank) {
		super();
		this.type = type;
		this.interest = interest;
		this.bank = bank;
	}

	@Override
	public void registerObserver(Observer observer) {
		list.add(observer);

	}

	@Override
	public void removeObserver(Observer observer) {
		list.remove(observer);
	}

	@Override
	public void notifyObserver() {
		for (Observer ob : list)
		{
			System.out.println("Notify observer on the change of the interest");
			ob.update(this.interest);
		}

	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getInterest() {
		return interest;
	}

	public void setInterest(float interest) {
		this.interest = interest;
		notifyObserver();
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

}
