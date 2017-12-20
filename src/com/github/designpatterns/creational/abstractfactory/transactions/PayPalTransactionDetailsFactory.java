package com.github.designpatterns.creational.abstractfactory.transactions;

import java.util.UUID;

public class PayPalTransactionDetailsFactory implements TransactionDetailsFactory {

    @Override
    public String createId() {
        return "PP " + UUID.randomUUID().toString();
    }

    @Override
    public String createProcessorName() {
        return "PayPal";
    }
}
