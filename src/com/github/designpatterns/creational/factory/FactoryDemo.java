package com.github.designpatterns.creational.factory;

import com.github.designpatterns.creational.factory.computer.Computer;
import com.github.designpatterns.creational.factory.computer.ComputerFactory;

/**
 * This pattern originates from the 1994 "Gang of Four (GOF)".
 * It is rarely if ever used on its own, but is the backbone behind the more complex Factory Method and Abstract Factory.
 *
 * The goal is to expose a factory class that creates objects without exposing creation logic to the client.
 */
public class FactoryDemo {
    public static void main(String[] args) {
        Computer desktop = ComputerFactory.getComputer("desktop");
        desktop.printDescription();

        Computer smartPhone = ComputerFactory.getComputer("smartphone");
        smartPhone.printDescription();

        Computer laptop = ComputerFactory.getComputer("laptop");
        laptop.printDescription();
    }
}
