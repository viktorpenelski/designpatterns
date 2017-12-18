package com.github.designpatterns.creational.factorymethod.processors;

import com.github.designpatterns.creational.factorymethod.transactions.BankWireEURTransaction;
import com.github.designpatterns.creational.factorymethod.transactions.BankWireUSDTransaction;
import com.github.designpatterns.creational.factorymethod.transactions.Transaction;

public class BankWire extends Processor {

    @Override
    public Transaction createTransaction(String amount, String currency) {
        switch (currency.toUpperCase()) {
            case "EUR":
                return new BankWireEURTransaction(amount);
            case "USD":
                return new BankWireUSDTransaction(amount);
            default:
                throw new RuntimeException(String.format("Currency [%s] not supported!", currency));
        }
    }
}
