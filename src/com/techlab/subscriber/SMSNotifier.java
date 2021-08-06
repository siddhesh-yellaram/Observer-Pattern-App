package com.techlab.subscriber;

import com.techlab.publisher.Account;
import com.techlab.publisher.INotifier;

public class SMSNotifier implements INotifier{

	@Override
	public void notify(Account a) {
		System.out.println("Sending Balance through SMS Notification \nDear "+a.getAccName()+" your account no "+a.getAccNo()+" has a balance of Rs."+a.getBalance());
	}
	
}
