package com.example.bankng;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.banking.common.Account;

public class BankingApplication {
	private static ApplicationContext context;
	public static void main(String[] args) {
		context = new AnnotationConfigApplicationContext(BankAppConfig.class);
		Account account = context.getBean("currentAccount", Account.class);
		System.out.println(account.createAccount());
		System.out.println(account.getCardDetails());
	}

}
