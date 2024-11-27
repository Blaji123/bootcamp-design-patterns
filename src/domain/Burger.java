package domain;

public class Burger implements Food{
    @Override
    public void prepare() {
        System.out.println("Preparing Burger...");
    }

    @Override
    public void serve() {
        System.out.println("Serving Burger...");
    }
}
