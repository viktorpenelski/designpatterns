package com.github.designpatterns.behavioral.observer;

/**
 * The Observer Pattern defines a one-to-many dependency between objects. When one object changes
 * state, all of its dependents are notified and updated automatically.
 */
public interface Observable {

  void registerObserver(Observer observer);

  void removeObserver(Observer observer);

  void notifyObservers();
}
