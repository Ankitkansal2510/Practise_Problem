package com.ankit.ObserverDesignPattern;

public class ObserverTest {

	public static void main(String[] args) {
		NewsPaper printMedia=new NewsPaper();
		Internet printInternet=new Internet();
		
		Loan personalLoan=new Loan("Personal Loan",12.5f,"SBI");
		personalLoan.registerObserver(printInternet);
		personalLoan.registerObserver(printMedia);
		
		personalLoan.setInterest(13.5f);

	}

}
