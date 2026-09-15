import java.util.*;

/**
 * Task 4: HackerRank - Java Visitor Pattern
 * 
 * Problem Summary:
 * Implement three visitors for a tree structure:
 * 1. SumInLeavesVisitor: Sum of values of all leaf nodes.
 * 2. ProductOfRedNodesVisitor: Product of values of all RED nodes modulo 10^9+7.
 * 3. FancyVisitor: Non-leaf nodes at even depth sum minus RED leaf nodes sum.
 * 
 * Concept: Visitor Design Pattern & Tree Traversal.
 */
public class week8_task3_JavaVisitorPattern {

    enum Color { RED, GREEN }

    abstract static class Tree {
        private int value;
        private Color color;
        private int depth;

        public Tree(int value, Color color, int depth) {
            this.value = value;
            this.color = color;
            this.depth = depth;
        }

        public int getValue() { return value; }
        public Color getColor() { return color; }
        public int getDepth() { return depth; }

        public abstract void accept(TreeVis visitor);
    }

    static class TreeNode extends Tree {
        private ArrayList<Tree> children = new ArrayList<>();

        public TreeNode(int value, Color color, int depth) {
            super(value, color, depth);
        }

        public void accept(TreeVis visitor) {
            visitor.visitNode(this);
            for (Tree child : children) {
                child.accept(visitor);
            }
        }

        public void addChild(Tree child) { children.add(child); }
    }

    static class TreeLeaf extends Tree {
        public TreeLeaf(int value, Color color, int depth) {
            super(value, color, depth);
        }

        public void accept(TreeVis visitor) {
            visitor.visitLeaf(this);
        }
    }

    abstract static class TreeVis {
        public abstract int getResult();
        public abstract void visitNode(TreeNode node);
        public abstract void visitLeaf(TreeLeaf leaf);
    }

    static class SumInLeavesVisitor extends TreeVis {
        private int result = 0;

        public int getResult() { return result; }
        public void visitNode(TreeNode node) {}

        public void visitLeaf(TreeLeaf leaf) {
            result += leaf.getValue();
        }
    }

    static class ProductOfRedNodesVisitor extends TreeVis {
        private long result = 1;
        private final int MOD = 1000000007;

        public int getResult() { return (int) result; }

        public void visitNode(TreeNode node) {
            if (node.getColor() == Color.RED) {
                result = (result * node.getValue()) % MOD;
            }
        }

        public void visitLeaf(TreeLeaf leaf) {
            if (leaf.getColor() == Color.RED) {
                result = (result * leaf.getValue()) % MOD;
            }
        }
    }

    static class FancyVisitor extends TreeVis {
        private int evenDepthNonLeafSum = 0;
        private int redLeafSum = 0;

        public int getResult() { return Math.abs(evenDepthNonLeafSum - redLeafSum); }

        public void visitNode(TreeNode node) {
            if (node.getDepth() % 2 == 0) {
                evenDepthNonLeafSum += node.getValue();
            }
        }

        public void visitLeaf(TreeLeaf leaf) {
            if (leaf.getColor() == Color.RED) {
                redLeafSum += leaf.getValue();
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4, Color.RED, 0);
        TreeNode n1 = new TreeNode(7, Color.GREEN, 1);
        TreeLeaf l1 = new TreeLeaf(2, Color.RED, 2);
        TreeLeaf l2 = new TreeLeaf(5, Color.GREEN, 2);

        root.addChild(n1);
        n1.addChild(l1);
        n1.addChild(l2);

        SumInLeavesVisitor v1 = new SumInLeavesVisitor();
        ProductOfRedNodesVisitor v2 = new ProductOfRedNodesVisitor();
        FancyVisitor v3 = new FancyVisitor();

        root.accept(v1);
        root.accept(v2);
        root.accept(v3);

        System.out.println("SumInLeavesVisitor: " + v1.getResult());         // Expected: 2 + 5 = 7
        System.out.println("ProductOfRedNodesVisitor: " + v2.getResult()); // Expected: 4 * 2 = 8
        System.out.println("FancyVisitor: " + v3.getResult());             // Expected: |4 - 2| = 2
    }
}

