import java.util.*;
public class repetition_elements_InArray {
        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 5, 2, 3, 4, 1, 2, 4};

            Arrays.sort(array);
            for (int ele:array) {
                System.out.println(ele);
            }

//            int count = 1;
//            for (int i = 1; i < array.length; i++) {
//                if (array[i] == array[i - 1]) {
//                    count++;
//                } else {
//                    System.out.println("Element " + array[i - 1] + " occurs " + count + " time(s).");
//                    count = 1;
//                }
//            }
//
//            // Print the count of the last element
//            System.out.println("Element " + array[array.length - 1] + " occurs " + count + " time(s).");
        }
}
