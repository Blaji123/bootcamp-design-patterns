package domain;

import observer.Observable;
import observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Order implements Observable{
    private String status;
    private final List<Observer> observers = new ArrayList<>();

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(status));
    }
}
