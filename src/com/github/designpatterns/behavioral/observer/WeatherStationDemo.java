package com.github.designpatterns.behavioral.observer;

import java.util.Random;

public class WeatherStationDemo {

  public static void main(String[] args) throws InterruptedException {
    WeatherData weatherData = new WeatherData();
    ConsoleDisplay consoleDisplay = new ConsoleDisplay(weatherData);

    while (true) {
      Random random = new Random(System.currentTimeMillis());

      int min = 5;
      int max = 30;

      weatherData.setMeasurements(min + random.nextFloat() * (max - min),
          min + random.nextFloat() * (max - min));

      Thread.sleep(1000L);
    }

  }
}
