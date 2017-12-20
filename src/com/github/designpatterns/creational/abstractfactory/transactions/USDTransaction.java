package com.github.designpatterns.creational.abstractfactory.transactions;

public class USDTransaction extends Transaction {
    TransactionDetailsFactory detailsFactory;

    public USDTransaction(TransactionDetailsFactory factory) {
        this.detailsFactory = factory;
    }


    @Override
    public void prepare() {
        id = detailsFactory.createId();
        processorName = detailsFactory.createProcessorName();
        currency = "USD";
    }

}
