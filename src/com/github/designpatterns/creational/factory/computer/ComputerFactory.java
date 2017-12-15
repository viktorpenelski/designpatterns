package com.github.designpatterns.creational.factory.computer;

/**
 * This pattern originates from the 1994 "Gang of Four (GOF)".
 * It is the backbone behind the more complex Factory Method and Abstract Factory.
 *
 * The goal is to expose a factory class that creates objects without exposing creation logic to the client.
 */
public class ComputerFactory {

    public static Computer getComputer(String type) {
        switch (type.toUpperCase()) {
            case "DESKTOP":
                return new Desktop();
            case "LAPTOP":
                return new Laptop();
            case "SMARTPHONE":
                return new Smartphone();
            default:
                throw new RuntimeException("Invalid computer type: " + type);
        }
    }
}
