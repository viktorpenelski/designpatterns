package com.github.designpatterns.creational.abstractfactory.transactions;

public abstract class Transaction {
    protected String id;
    protected String currency;
    protected String amount;
    protected String processorName;

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

    public String getId() {
        return id;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
