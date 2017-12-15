package com.github.designpatterns.creational.factory;

import com.github.designpatterns.creational.factory.computer.Computer;
import com.github.designpatterns.creational.factory.computer.ComputerFactory;

/**
 * Simple demo of the Factory design pattern.
 * For more info about the pattern itself, check out {@link ComputerFactory}
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
