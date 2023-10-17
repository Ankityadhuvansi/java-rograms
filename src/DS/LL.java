package DS;

public class LL {
    private node head;
    private node tail;
    private int size;
    public LL(){
        this.size= 0;
    }
    private class node {
        private int data;
        private node next;
        public node(int data) {
            this.data = data;
            this.next = null;
        }
        public node(int data, node next) {
            this.data = data;
            this.next = next;

        }
    }

    public void insertFirst(int data){
        node Node = new node(data);
        Node.next= head;
        head= Node;
        if(tail==null){
            tail=head;
        }
        size+=1;
    }
    public void insertLast(int data){
        if(tail==null){
            insertFirst(data);
            return;
        }
        node Node=new node(data);
        tail.next=Node;
        tail=Node;
        size+=1;
    }
    public void insertAtIndex(int data,int index){
        if(index==0){
            insertFirst(data);
            return;
        }
        if(index==size){
            insertLast(data);
        }
        node Node=new node(data);
        node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node.next=temp.next;
        temp.next=Node;
        size++;
    }
    public int deleteFirst(){
        if(head==null){
            tail=null;
        }else {
            head = head.next;
        }
        size--;
        return 0;
    }
    public int deleteLast(){
        if (size <= 1) {
            return deleteFirst();
        }
        node node=head;
        int temp= head.data;
        while(node.next.next!=null){
            node=node.next;
        }
        node.next=null;
        return temp;
    }
    public int deleteIndex(int index){
        if (size == 0) {
            return deleteFirst();
        }
        if (index==size-1){
            return deleteLast();
        }

        return index;
    }

    void display(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("End");
    }
}

