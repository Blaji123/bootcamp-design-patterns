package domain;

import observer.Observer;

public class Customer implements Observer {
    private final String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(String status) {
        System.out.println(name + " received update: " + status);
    }
}
