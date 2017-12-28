package com.github.designpatterns.behavioral.observer;

public class ConsoleDisplay implements Observer, DisplayElement {

  private float temperature;
  private float humidity;
  private Observable weatherData;

  public ConsoleDisplay(Observable weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  @Override
  public void update(float temperature, float humidity) {
    this.temperature = temperature;
    this.humidity = humidity;

    display();
  }

  @Override
  public void display() {
    System.out.printf("The temperature is %.2f°C with a humidity of %.2f%n", temperature, humidity);

  }
}
