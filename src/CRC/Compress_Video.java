package CRC;

import java.util.ArrayList;

public class Compress_Video {
    public static int  compress(ArrayList<Integer>arr){
        for (int i = 0; i < arr.size()-1; i++) {
            if(arr.get(i)== arr.get(i+1) ){
                arr.remove(i);
            }
        }
        return arr.size();
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(1);
//        list.add(2);
//        list.add(2);
//        list.add(4);
//        list.add(5);

        System.out.println(compress(list));
    }
}
