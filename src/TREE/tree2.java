package TREE;

public class tree2 {
    private static class Node{
        Node left,right;
        int data;
        public Node(int val){
            this.data=val;
        }
        public Node(){}

        public void insert(int val){
            if(val<=data){
                if(left==null){
                    left= new Node(val);
                }else{
                    left.insert(val);
                }
            }else {
                if (right==null){
                    right= new Node(val);
                }else {
                    right.insert(val);
                }
            }
        }
        public  void inOrder(){
            if(left!=null) {
                left.inOrder();
            }
            System.out.println(data);
            if(right!=null) {
                right.inOrder();
            }
        }
    }

    public static void main(String[] args) {
        Node node= new Node();
        node.insert(18);
        node.insert(20);
        node.insert(33);
        node.insert(4);
        node.insert(51);
        node.insert(16);
        node.inOrder();
    }

}
