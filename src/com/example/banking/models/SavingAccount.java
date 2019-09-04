package com.example.banking.models;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.banking.common.Account;
import com.example.banking.common.Card;

public class SavingAccount implements Account {
	
	@Autowired
	private Card card;

	@Override
	public String createAccount() {
		// TODO Auto-generated method stub
		return "Saving Account created";
	}

	@Override
	public String getCardDetails() {
		// TODO Auto-generated method stub
		return this.card.getCardDetails();
	}

}
