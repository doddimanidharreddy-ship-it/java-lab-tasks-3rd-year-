import java.util.*;

/**
 * Task 4: LeetCode 1472 - Design Browser History
 * 
 * Problem Summary:
 * Implement the BrowserHistory class:
 * - BrowserHistory(string homepage): Initializes with homepage.
 * - visit(string url): Visits url, clears forward history.
 * - back(int steps): Moves back in history by steps, returns current url.
 * - forward(int steps): Moves forward in history by steps, returns current url.
 * 
 * Approach:
 * Maintain an ArrayList of history URLs and an integer pointer `currentIndex`.
 * 
 * Time Complexity: O(1) for visit, back, and forward.
 * Space Complexity: O(N) where N is number of visited URLs.
 */
public class week7_task3_DesignBrowserHistory {

    static class BrowserHistory {
        private List<String> history;
        private int curr;

        public BrowserHistory(String homepage) {
            history = new ArrayList<>();
            history.add(homepage);
            curr = 0;
        }

        public void visit(String url) {
            // Truncate forward history
            history = new ArrayList<>(history.subList(0, curr + 1));
            history.add(url);
            curr++;
        }

        public String back(int steps) {
            curr = Math.max(0, curr - steps);
            return history.get(curr);
        }

        public String forward(int steps) {
            curr = Math.min(history.size() - 1, curr + steps);
            return history.get(curr);
        }
    }

    public static void main(String[] args) {
        BrowserHistory bh = new BrowserHistory("leetcode.com");
        bh.visit("google.com");
        bh.visit("facebook.com");
        bh.visit("youtube.com");

        System.out.println("Back(1): " + bh.back(1));       // Expected: facebook.com
        System.out.println("Back(1): " + bh.back(1));       // Expected: google.com
        System.out.println("Forward(1): " + bh.forward(1)); // Expected: facebook.com
        bh.visit("linkedin.com");                           // Clears youtube.com
        System.out.println("Forward(2): " + bh.forward(2)); // Expected: linkedin.com
        System.out.println("Back(2): " + bh.back(2));       // Expected: google.com
    }
}

