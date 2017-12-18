package com.github.designpatterns.creational.factorymethod.transactions;

import java.util.UUID;

public class PayPalUSDTransaction extends Transaction {

    public PayPalUSDTransaction(String amount) {
        processorName = "PayPal";
        id = UUID.randomUUID().toString();
        currency = "USD";
        amount = amount;

    }
}
