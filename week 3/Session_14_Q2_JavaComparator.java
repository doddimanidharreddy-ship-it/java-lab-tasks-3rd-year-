import java.util.Arrays;
import java.util.Comparator;

public class Session_14_Q2_JavaComparator {
    static class Player {
        String name;
        int score;

        public Player(String name, int score) {
            this.name = name;
            this.score = score;
        }

        @Override
        public String toString() {
            return name + " " + score;
        }
    }

    static class Checker implements Comparator<Player> {
        @Override
        public int compare(Player a, Player b) {
            if (a.score != b.score) {
                return Integer.compare(b.score, a.score);
            }
            return a.name.compareTo(b.name);
        }
    }

    public static void main(String[] args) {
        Player[] players = {
            new Player("amy", 100),
            new Player("david", 100),
            new Player("heraldo", 50),
            new Player("aakansha", 75),
            new Player("aleksa", 150)
        };

        Arrays.sort(players, new Checker());

        System.out.println("Sorted Players:");
        for (Player p : players) {
            System.out.println(p);
        }
    }
}
/*
OUTPUT:
Sorted Players:
aleksa 150
amy 100
david 100
aakansha 75
heraldo 50
*/
