package com.github.designpatterns.creational.factorymethod.transactions;

import java.util.UUID;

public class PayPalEURTransaction extends Transaction {

    public PayPalEURTransaction(String amount) {
        processorName = "PayPal";
        id = UUID.randomUUID().toString();
        currency = "EUR";
        amount = amount;

    }
}
