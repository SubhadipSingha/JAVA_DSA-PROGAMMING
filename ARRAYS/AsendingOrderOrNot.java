package ARRAYS;

import java.util.Scanner;

public class AsendingOrderOrNot {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF THE ARRAY:");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("NOW ENTER THE ELEMENTS OF THE ARRAY:");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }

        Boolean isA = true;
        for(int i=0; i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isA = false;
            }
        }

        if(isA){
            System.out.println("the array is in asending order ");
            for(int i=0;i<n;i++){
                System.out.print("[ "+arr[i] + " ]");
            } 
        }else{
            System.out.println("the array is not in asending order ");
        }

    }
}
