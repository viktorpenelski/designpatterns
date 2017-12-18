package com.github.designpatterns.creational.factorymethod.transactions;

public abstract class Transaction {
    String id;
    String currency;
    String amount;
    String processorName;

    public void prepare() {
        System.out.println("Parsing input transaction.");
        System.out.println("    id: " + id);
        System.out.println("    currency: " + currency);
        System.out.println("    amount: " + amount);
    }

    public void persist() {
        System.out.println("Persisting the transaction to the database...");
    }

    public void send() {
        System.out.println("Sending the transaction to a downstream dependency...");
    }

    public void handleResponse() {
        System.out.println("Handling the response from the downstream dependency...");
    }

    public String getProcessorName() {
        return processorName;
    }
}
