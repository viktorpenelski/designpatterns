package com.github.designpatterns.creational.abstractfactory.processors;

import com.github.designpatterns.creational.abstractfactory.transactions.*;

public class PayPal extends Processor {

    private Transaction transaction = null;
    private TransactionDetailsFactory factory = new PayPalTransactionDetailsFactory();

    @Override
    public Transaction createTransaction(String amount, String currency) {
        switch (currency.toUpperCase()) {
            case "EUR":
                transaction = new EURTransaction(factory);
                break;
            case "USD":
                transaction = new USDTransaction(factory);
                break;
            default:
                throw new RuntimeException(String.format("Currency [%s] not supported!", currency));
        }
        transaction.setAmount(amount);
        return transaction;
    }
}
