package com.github.designpatterns.creational.factorymethod.transactions;

import java.util.UUID;

public class BankWireUSDTransaction extends Transaction {

    public BankWireUSDTransaction(String amount) {
        processorName = "Bank of PogChamp!";
        id = UUID.randomUUID().toString();
        currency = "USD";
        amount = amount;
    }
}
