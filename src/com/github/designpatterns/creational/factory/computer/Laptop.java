package com.github.designpatterns.creational.factory.computer;

public class Laptop implements Computer {

    /**
     * package-private constructor prevents instantiation of the class from outside the {@link ComputerFactory}
     */
    Laptop() {

    }

    @Override
    public void printDescription() {
        System.out.println("A laptop, often called a notebook or \"notebook computer\", is a small, " +
                "portable personal computer with a \"clamshell\" form factor, an alphanumeric keyboard on the " +
                "lower part of the \"clamshell\" and a thin LCD or LED computer screen on the upper part, " +
                "which is opened up to use the computer. ");
    }
}
