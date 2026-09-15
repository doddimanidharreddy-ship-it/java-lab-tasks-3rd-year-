import java.util.*;

/**
 * Task 3: LeetCode 1396 - Design Underground System
 * 
 * Problem Summary:
 * Implement the UndergroundSystem class:
 * - checkIn(int id, string stationName, int t)
 * - checkOut(int id, string stationName, int t)
 * - getAverageTime(string startStation, string endStation)
 * 
 * Approach:
 * Use a checkInMap (id -> {startStation, startTime}) and a routeMap (startStation->endStation -> {totalTime, count}).
 * 
 * Time Complexity: O(1) for all methods.
 * Space Complexity: O(P + R) where P is passenger count and R is route count.
 */
public class Task03_DesignUndergroundSystem {

    static class UndergroundSystem {

        static class CheckInInfo {
            String stationName;
            int time;

            CheckInInfo(String stationName, int time) {
                this.stationName = stationName;
                this.time = time;
            }
        }

        static class RouteInfo {
            double totalTime;
            int tripCount;

            RouteInfo(double totalTime, int tripCount) {
                this.totalTime = totalTime;
                this.tripCount = tripCount;
            }
        }

        private Map<Integer, CheckInInfo> checkInMap;
        private Map<String, RouteInfo> routeMap;

        public UndergroundSystem() {
            checkInMap = new HashMap<>();
            routeMap = new HashMap<>();
        }

        public void checkIn(int id, String stationName, int t) {
            checkInMap.put(id, new CheckInInfo(stationName, t));
        }

        public void checkOut(int id, String stationName, int t) {
            CheckInInfo info = checkInMap.remove(id);
            String routeKey = info.stationName + "->" + stationName;
            int travelTime = t - info.time;

            RouteInfo route = routeMap.getOrDefault(routeKey, new RouteInfo(0, 0));
            route.totalTime += travelTime;
            route.tripCount++;
            routeMap.put(routeKey, route);
        }

        public double getAverageTime(String startStation, String endStation) {
            String routeKey = startStation + "->" + endStation;
            RouteInfo route = routeMap.get(routeKey);
            return route.totalTime / route.tripCount;
        }
    }

    public static void main(String[] args) {
        UndergroundSystem us = new UndergroundSystem();
        us.checkIn(45, "Leyton", 3);
        us.checkIn(32, "Paradise", 8);
        us.checkOut(45, "Waterloo", 15);
        us.checkOut(32, "Waterloo", 22);

        System.out.println("Average Leyton->Waterloo: " + us.getAverageTime("Leyton", "Waterloo")); // Expected: 12.0
        System.out.println("Average Paradise->Waterloo: " + us.getAverageTime("Paradise", "Waterloo")); // Expected: 14.0
    }
}
