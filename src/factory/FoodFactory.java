package factory;

import domain.Burger;
import domain.Food;
import domain.Pizza;

public class FoodFactory {
    public static Food createFood(String type) {
        return switch (type.toLowerCase()){
            case "pizza" -> new Pizza();
            case "burger" -> new Burger();
            default -> throw new IllegalArgumentException("Unknown food type");
        };
    }
}
