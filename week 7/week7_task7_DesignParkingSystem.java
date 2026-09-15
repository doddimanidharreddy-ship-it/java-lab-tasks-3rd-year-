public class week7_task7_DesignParkingSystem {
    static class ParkingSystem {
        private int big, medium, small;
        public ParkingSystem(int b, int m, int s) { big = b; medium = m; small = s; }
        public boolean addCar(int carType) {
            if (carType == 1 && big > 0) { big--; return true; }
            if (carType == 2 && medium > 0) { medium--; return true; }
            if (carType == 3 && small > 0) { small--; return true; }
            return false;
        }
    }
    public static void main(String[] args) {
        ParkingSystem ps = new ParkingSystem(1, 1, 0);
        System.out.println(ps.addCar(1));
    }
}