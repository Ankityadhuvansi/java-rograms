package DS.STACK;

import java.util.EmptyStackException;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    int ptr=-1;
    CustomStack(int size){
        this.data=new int[size];
    }
    public boolean push(int data){
        if(isFull()){
            System.out.println("Stack is full");
        }
        return false;
    }

    private boolean isFull() {

        return false;
    }
}
