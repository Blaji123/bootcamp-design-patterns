package domain;

public class Pizza implements Food{
    @Override
    public void prepare() {
        System.out.println("Preparing Pizza...");
    }

    @Override
    public void serve() {
        System.out.println("Serving Pizza...");
    }
}
