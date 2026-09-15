import java.util.*;

/**
 * Task 8: HackerRank - Java Factory Pattern
 * 
 * Problem Summary:
 * Implement a Factory class FoodFactory with method getFood(String order) 
 * returning an instance of Pizza or Cake based on input string.
 * 
 * Concept: Factory Design Pattern.
 */
public class week8_task7_JavaFactoryPattern {

    interface Food {
        String getType();
    }

    static class Pizza implements Food {
        public String getType() {
            return "Someone ordered a Fast Food!";
        }
    }

    static class Cake implements Food {
        public String getType() {
            return "Someone ordered a Dessert!";
        }
    }

    static class FoodFactory {
        public Food getFood(String order) {
            if ("pizza".equalsIgnoreCase(order)) {
                return new Pizza();
            } else if ("cake".equalsIgnoreCase(order)) {
                return new Cake();
            }
            return null;
        }
    }

    public static void main(String[] args) {
        FoodFactory foodFactory = new FoodFactory();

        Food food1 = foodFactory.getFood("cake");
        System.out.println("The factory returned " + food1.getClass().getSimpleName());
        System.out.println(food1.getType());

        Food food2 = foodFactory.getFood("pizza");
        System.out.println("The factory returned " + food2.getClass().getSimpleName());
        System.out.println(food2.getType());
    }
}

