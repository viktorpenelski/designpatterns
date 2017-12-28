package com.github.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Observable {

  private float temperature;
  private float humidity;

  private List<Observer> observers;

  public WeatherData() {
    observers = new ArrayList<>();
  }

  @Override
  public void registerObserver(Observer obs) {
    if (!observers.contains(obs)) {
      observers.add(obs);
    }
  }

  @Override
  public void removeObserver(Observer obs) {
    int index = observers.indexOf(obs);
    if (index >= 0) {
      observers.remove(index);
    }
  }

  @Override
  public void notifyObservers() {
    for (Observer o : observers) {
      o.update(temperature, humidity);
    }
  }

  public void setMeasurements(float temperature, float humidity) {
    this.temperature = temperature;
    this.humidity = humidity;

    notifyObservers();
  }

}
