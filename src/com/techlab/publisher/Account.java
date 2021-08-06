package com.techlab.publisher;

import java.util.*;

public class Account {
	private int accNo;
	private String accName;
	private double balance;
	private List<INotifier> notifiers;
	
	public Account(int accNo, String accName, double balance) {
		this.accNo = accNo;
		this.accName = accName;
		this.balance = balance;
		this.notifiers= new ArrayList<INotifier>();
	}
	
	public void addNotifier(INotifier notifier) {
		this.notifiers.add(notifier);
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withdraw(double amount) {
		this.balance -= amount;
	}

	public int getAccNo() {
		return accNo;
	}

	public String getAccName() {
		return accName;
	}

	public double getBalance() {
		return balance;
	}

	public List<INotifier> getNotifiers() {
		return notifiers;
	}
	
	public void sendNotification() {
		for(INotifier n : this.notifiers) {
			n.notify(this);
		}
	}
}
