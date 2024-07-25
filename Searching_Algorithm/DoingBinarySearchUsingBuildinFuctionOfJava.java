package Searching_Algorithm;

import java.util.Arrays;

public class DoingBinarySearchUsingBuildinFuctionOfJava {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int target = 68;

       for(int i =0 ; i < arr.length ; i++){
        arr[i] = i;
       }
       int idx = Arrays.binarySearch(arr, target);
       if(idx== -1){
        System.out.println(target+" not found");
       }else{
        System.out.println(target+" found at Index "+idx);
       }
    }
}
