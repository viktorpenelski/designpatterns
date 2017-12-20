package com.github.designpatterns.creational.abstractfactory.transactions;

import java.util.UUID;

public class BankWireTransactionDetailsFactory implements TransactionDetailsFactory {

    @Override
    public String createId() {
        return "BW " + UUID.randomUUID().toString();
    }

    @Override
    public String createProcessorName() {
        return "BankWire";
    }
}
