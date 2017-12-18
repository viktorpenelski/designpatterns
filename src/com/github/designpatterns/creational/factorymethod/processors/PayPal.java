package com.github.designpatterns.creational.factorymethod.processors;

import com.github.designpatterns.creational.factorymethod.transactions.PayPalEURTransaction;
import com.github.designpatterns.creational.factorymethod.transactions.PayPalUSDTransaction;
import com.github.designpatterns.creational.factorymethod.transactions.Transaction;

public class PayPal extends Processor {

    @Override
    public Transaction createTransaction(String amount, String currency) {
        switch (currency.toUpperCase()) {
            case "EUR":
                return new PayPalEURTransaction(amount);
            case "USD":
                return new PayPalUSDTransaction(amount);
            default:
                throw new RuntimeException(String.format("Currency [%s] not supported!", currency));
        }
    }
}
