import java.util.*;

/**
 * Task 2: HackerRank - Java Method Overriding 2 (Super Keyword)
 * 
 * Problem Summary:
 * Override define_syntax in MotorCycle class and call the parent class BiCycle's 
 * define_syntax method using the `super` keyword.
 * 
 * Concept: Super Keyword in Inheritance.
 */
public class Task02_JavaMethodOverriding2SuperKeyword {

    static class BiCycle {
        String define_syntax() {
            return "a vehicle with two wheels.";
        }
    }

    static class MotorCycle extends BiCycle {
        @Override
        String define_syntax() {
            return "a cycle with an engine.";
        }

        MotorCycle() {
            System.out.println("Hello I am a motorcycle, I am " + define_syntax());
            String temp = super.define_syntax();
            System.out.println("My ancestor is a cycle who is " + temp);
        }
    }

    public static void main(String[] args) {
        MotorCycle M = new MotorCycle();
    }
}
