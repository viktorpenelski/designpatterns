package com.github.designpatterns.creational.factorymethod.processors;

import com.github.designpatterns.creational.factorymethod.transactions.Transaction;

public abstract class Processor {

    public Transaction makePayment(String amount, String currency) {
        Transaction transaction;
        transaction = createTransaction(amount, currency);

        transaction.prepare();
        transaction.persist();
        transaction.send();
        transaction.handleResponse();

        return transaction;
    }

    protected abstract Transaction createTransaction(String amount, String currency);
}
