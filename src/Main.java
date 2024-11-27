import domain.Customer;
import domain.Order;
import factory.FoodFactory;
import domain.Food;

public class Main {
    public static void main(String[] args) {
        Food pizza = FoodFactory.createFood("pizza");
        pizza.prepare();
        pizza.serve();

        Order order = new Order();
        Customer customer1 = new Customer("David");
        Customer customer2 = new Customer("George");

        order.addObserver(customer1);
        order.addObserver(customer2);

        order.setStatus("Order placed.");
        order.setStatus("Order prepared.");
        order.setStatus("Order dispatched.");
        order.setStatus("Order delivered.");
    }
}