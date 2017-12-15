package com.github.designpatterns.creational.factory.computer;

public class Smartphone implements Computer {

    /**
     * package-private constructor prevents instantiation of the class from outside the {@link ComputerFactory}
     */
    Smartphone() {

    }

    @Override
    public void printDescription() {
        System.out.println(
                "A smartphone is a handheld personal computer with a mobile operating system " +
                        "and an integrated mobile broadband cellular network connection for voice, SMS, " +
                        "and Internet data communication; most if not all smartphones also support Wi-Fi. ");
    }
}
