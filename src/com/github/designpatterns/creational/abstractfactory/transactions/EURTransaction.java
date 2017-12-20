package com.github.designpatterns.creational.abstractfactory.transactions;

public class EURTransaction extends Transaction {
    TransactionDetailsFactory detailsFactory;

    public EURTransaction(TransactionDetailsFactory factory) {
        this.detailsFactory = factory;
    }


    @Override
    public void prepare() {
        id = detailsFactory.createId();
        processorName = detailsFactory.createProcessorName();
        currency = "EUR";
    }

}
