package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class MergeSort {
    public int[] sortArray(int[] nums) {
        return mergeSort(nums);
    }
    public int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0 , mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left,right);
    }
    public int[] merge(int[] first, int[] second){
        int[] mergeArr = new int[first.length+second.length];
        int i=0;
        int j=0;
        int k= 0;

        while(i< first.length && j< second.length){
            if(first[i]<second[j]){
                mergeArr[k++] = first[i++];
            }else{
                mergeArr[k++] = second[j++];
            }
        }
        while(i< first.length){
            mergeArr[k++] = first[i++];
        }
        while(j< second.length){
            mergeArr[k++] = second[j++];
        }
        return mergeArr;
    }
}
