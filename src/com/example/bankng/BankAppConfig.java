package com.example.bankng;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import com.example.banking.models.CurrentAccount;
import com.example.banking.models.DebitCard;

public class BankAppConfig {
	
	@Bean
	public DebitCard debitCard() {
		return new DebitCard();
	}
	
	@Bean(initMethod="onInit", destroyMethod="onDestroy")
	@Scope("prototype")
	public CurrentAccount currentAccount() {
		return new CurrentAccount();
	}

}
