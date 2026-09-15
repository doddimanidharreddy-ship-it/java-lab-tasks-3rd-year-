import java.util.*;

/**
 * Task 1: LeetCode 1603 - Design Parking System
 * 
 * Problem Summary:
 * Design a parking system for a parking lot. The parking lot has three kinds of parking spaces:
 * big, medium, and small, with a fixed number of slots for each size.
 * 
 * Approach:
 * Maintain counters for big, medium, and small spaces.
 * When addCar(carType) is called, check if slot > 0, decrement slot, and return true.
 * 
 * Time Complexity: O(1) for constructor and addCar.
 * Space Complexity: O(1).
 */
public class Task01_DesignParkingSystem {

    static class ParkingSystem {
        private int big;
        private int medium;
        private int small;

        public ParkingSystem(int big, int medium, int small) {
            this.big = big;
            this.medium = medium;
            this.small = small;
        }

        public boolean addCar(int carType) {
            if (carType == 1) {
                if (big > 0) { big--; return true; }
            } else if (carType == 2) {
                if (medium > 0) { medium--; return true; }
            } else if (carType == 3) {
                if (small > 0) { small--; return true; }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        ParkingSystem ps = new ParkingSystem(1, 1, 0);
        System.out.println("Add Big (1): " + ps.addCar(1));     // Expected: true
        System.out.println("Add Medium (2): " + ps.addCar(2));  // Expected: true
        System.out.println("Add Small (3): " + ps.addCar(3));   // Expected: false
        System.out.println("Add Big (1): " + ps.addCar(1));     // Expected: false
    }
}
