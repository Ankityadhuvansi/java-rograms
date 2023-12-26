package CRC;

import java.util.ArrayList;
import java.util.Arrays;

//public class Even_Index {
//    public static boolean Even_ele(int[] arr){
//        for (int i = 0; i < arr.length; i+=2) {
//            System.out.println(arr[i]);
//        }
//        return false;
//    }
//    public static ArrayList<Integer> Even_ele1(int[] arr){
//        ArrayList<Integer> arraylist=new ArrayList<>();
//        int j=0;
//        for (int i = 0; i < arr.length; i+=2) {
//            arraylist.add(arr[i]);
//        }
//        return arraylist;
//    }
//
//    public static void main(String[] args) {
//        int[] arr={1,3,4,6,7,4,7,5,9};
//        System.out.println(Even_ele1(arr));
//    }
//}
class A
{
    public int i;
    public int j;
    A(){
        i = 1;
        j = 2;
    }}
    class B extends A
    {
        int a;
        B(){
            super();
        } }
    class Main
    {
        public static void main(String args[])
        {
            B obj = new B();
            System.out.println(obj.i + " " + obj.j);
        }
    }