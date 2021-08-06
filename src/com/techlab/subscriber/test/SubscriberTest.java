package com.techlab.subscriber.test;

import com.techlab.publisher.Account;
import com.techlab.subscriber.EmailNotifier;
import com.techlab.subscriber.SMSNotifier;

public class SubscriberTest {

	public static void main(String[] args) {
		Account a1 = new Account(101,"Steve",2000);
		a1.deposit(100);
		a1.addNotifier(new SMSNotifier());
		a1.addNotifier(new EmailNotifier());
		a1.sendNotification();
	}

}
