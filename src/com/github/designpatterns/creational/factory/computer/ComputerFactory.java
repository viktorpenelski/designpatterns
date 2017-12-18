package com.github.designpatterns.creational.factory.computer;

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
