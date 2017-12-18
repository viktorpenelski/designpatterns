package com.github.designpatterns.creational.factorymethod.transactions;

import java.util.UUID;

public class BankWireEURTransaction extends Transaction {

    public BankWireEURTransaction(String amount) {
        processorName = "Bank of PogChamp!";
        id = UUID.randomUUID().toString();
        currency = "EUR";
        amount = amount;
    }
}
