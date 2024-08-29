package TREE;

import java.util.Scanner;

public class Minimum_absolute_difference {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    private TreeNode root;

    // Method to construct tree from an array
    public void buildTreeFromArray(int[] arr) {
        if (arr.length == 0) {
            root = null;
        } else {
            root = buildTree(arr, 0);
        }
    }

    private TreeNode buildTree(int[] arr, int i) {
        // Base case for recursion
        if (i >= arr.length || arr[i] == -1) {
            return null;
        }

        TreeNode node = new TreeNode(arr[i]);
        node.left = buildTree(arr, 2 * i + 1);
        node.right = buildTree(arr, 2 * i + 2);

        return node;
    }

    private int min = Integer.MAX_VALUE;
    private Integer prev = null;

    public int getMinimumDifference(TreeNode root) {
        if (root == null) return min;

        getMinimumDifference(root.left);

        if (prev != null) {
            min = Math.min(min, Math.abs(root.val - prev));
        }
        prev = root.val;

        getMinimumDifference(root.right);

        return min;
    }

    public void display() {
        System.out.println("The minimum absolute difference in the BST is: " + getMinimumDifference(root));
    }

    public static void main(String[] args) {
        Minimum_absolute_difference tree = new Minimum_absolute_difference();

        // Example array to construct the tree
        int[] arr = {4, 2, 6, 1, 3, -1, -1};  // Example input array
        tree.buildTreeFromArray(arr);
        tree.display();
    }
}
