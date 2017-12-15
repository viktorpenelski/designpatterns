package com.github.designpatterns.creational.factory.computer;

public class Desktop implements Computer {

    /**
     * package-private constructor prevents instantiation of the class from outside the {@link ComputerFactory}
     */
    Desktop() {

    }

    @Override
    public void printDescription() {
        System.out.println("A personal computer (PC) is a multi-purpose computer whose size, capabilities, " +
                "and price make it feasible for individual use. ");
    }
}
