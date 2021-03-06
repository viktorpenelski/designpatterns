package com.github.designpatterns.creational.factorymethod;

import com.github.designpatterns.creational.factorymethod.processors.BankWire;
import com.github.designpatterns.creational.factorymethod.processors.PayPal;
import com.github.designpatterns.creational.factorymethod.transactions.Transaction;

/**
 * Demo for the implementation of Factory Method design pattern.
 *
 * The Factory Method Pattern defines an interface for creating an object,
 * but lets subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.
 */
public class FactoryMethodDemo {
    public static void main(String[] args) {
        PayPal payPal = new PayPal();
        BankWire bankWire = new BankWire();

        Transaction transaction = payPal.makePayment("15", "USD");
        System.out.println("\n\nCompleted a " + transaction.getProcessorName() + " transaction!\n");
        transaction = bankWire.makePayment("38", "EUR");
        System.out.println("\n\nCompleted a " + transaction.getProcessorName() + " transaction!\n");

    }
}
