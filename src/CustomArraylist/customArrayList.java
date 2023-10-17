package CustomArraylist;
import java.util.ArrayList;
public class customArrayList {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size =0;

    public customArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length *2];
        // copy the current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] =data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }
    public int remove(){
        int removed = data[--size];
        return removed;
    }
    public int size(){
        return size;
    }
    public void set(int index, int value){
        data[index] = value;
    }
    @Override
    public String toString() {
        String result = "[";
        for (int i = 0; i < size; i++) {
            result += data[i] + ",";
        }
        result += "]";
        return result;
    }
    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
        customArrayList list = new customArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);
        list.add(110);
        list.add(120);
        list.add(130);
        list.add(140);
        list.add(40);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.remove());
        System.out.println(list);
        System.out.println(list.size());
    }
}