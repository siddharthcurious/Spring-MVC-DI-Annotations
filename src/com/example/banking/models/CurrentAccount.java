package com.example.banking.models;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.banking.common.Account;
import com.example.banking.common.Card;

public class CurrentAccount implements Account {
	
	@Autowired
	private Card card;

	@Override
	public String createAccount() {
		// TODO Auto-generated method stub
		return "Current Account has been created";
	}

	@Override
	public String getCardDetails() {
		// TODO Auto-generated method stub
		return this.card.getCardDetails();
	}
	
	public void onInit() {
		System.out.println("Current Account object initialized");
	}
	
	public void onDestroy() {
		System.out.println("Current Account object destroyed");
	}

}
