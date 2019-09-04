package com.example.banking.models;

import com.example.banking.common.Card;

public class DebitCard implements Card {

	@Override
	public String getCardDetails() {
		return "This is Debit Card";
	}

}
