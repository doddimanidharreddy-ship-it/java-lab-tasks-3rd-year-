import java.util.*;

/**
 * Task 10: LeetCode 1600 - Throne Inheritance
 * 
 * Problem Summary:
 * Maintain a royal family tree and order of inheritance:
 * - ThroneInheritance(kingName): Initializes with king.
 * - birth(parentName, childName): Record birth of child under parent.
 * - death(name): Mark person as deceased.
 * - getInheritanceOrder(): Return list of living heirs in preorder DFS order.
 * 
 * Approach:
 * Tree adjacency list representation (parent -> list of children) + HashSet of dead members.
 * Preorder DFS traversal to obtain succession list.
 * 
 * Time Complexity: O(N) for getInheritanceOrder(), O(1) for birth and death.
 * Space Complexity: O(N) where N is total family members.
 */
public class Task10_ThroneInheritance {

    static class ThroneInheritance {
        private String king;
        private Map<String, List<String>> childrenMap;
        private Set<String> deadSet;

        public ThroneInheritance(String kingName) {
            this.king = kingName;
            this.childrenMap = new HashMap<>();
            this.deadSet = new HashSet<>();
        }

        public void birth(String parentName, String childName) {
            childrenMap.computeIfAbsent(parentName, k -> new ArrayList<>()).add(childName);
        }

        public void death(String name) {
            deadSet.add(name);
        }

        public List<String> getInheritanceOrder() {
            List<String> order = new ArrayList<>();
            dfs(king, order);
            return order;
        }

        private void dfs(String current, List<String> order) {
            if (!deadSet.contains(current)) {
                order.add(current);
            }
            List<String> children = childrenMap.getOrDefault(current, Collections.emptyList());
            for (String child : children) {
                dfs(child, order);
            }
        }
    }

    public static void main(String[] args) {
        ThroneInheritance ti = new ThroneInheritance("king");
        ti.birth("king", "andy");
        ti.birth("king", "bob");
        ti.birth("king", "catherine");
        ti.birth("andy", "matthew");
        ti.birth("bob", "alex");
        ti.birth("bob", "asha");

        System.out.println("Inheritance Order 1: " + ti.getInheritanceOrder());
        // Expected: [king, andy, matthew, bob, alex, asha, catherine]

        ti.death("bob");
        System.out.println("Inheritance Order 2 (after Bob's death): " + ti.getInheritanceOrder());
        // Expected: [king, andy, matthew, alex, asha, catherine]
    }
}
