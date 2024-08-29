package TREE;

import java.util.*;

public class BFS {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
        Node(int val ,Node left, Node right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static List<List<Integer>> breadthFirstSearch(Node root){
        if(root==null){
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        Queue<Node> queue= new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> list1 =new ArrayList<>(levelSize);
            for (int i = 0; i < levelSize; i++) {
                Node curr = queue.poll();
                list1.add(curr.val);
                if(curr.left != null){
                    queue.add(curr.left);
                }
                if(curr.right != null) queue.add(curr.right);
            }
            result.add(list1);
        }
        return result;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        System.out.println(breadthFirstSearch(root));
    }
}
