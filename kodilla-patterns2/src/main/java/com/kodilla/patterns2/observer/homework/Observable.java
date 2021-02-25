package com.kodilla.patterns2.observer.homework;

public interface Observable {

    void notifyObserver();
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
}

