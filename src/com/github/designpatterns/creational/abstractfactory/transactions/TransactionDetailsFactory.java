package com.github.designpatterns.creational.abstractfactory.transactions;

public interface TransactionDetailsFactory {

    public String createId();
    public String createProcessorName();
}
