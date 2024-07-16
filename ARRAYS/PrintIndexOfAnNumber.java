package ARRAYS;

import java.util.Scanner;

public class PrintIndexOfAnNumber {
    public static void main(String[] args) {
    
    Scanner s=new Scanner(System.in);
    System.out.println("ENTER THE SIZE OF THE ARRAY:");
    int n = s.nextInt();
    int [] arr = new int[n];
    System.out.println("NOW ENTER THE ELEMENTS OF THE ARRAY:");
    for(int i=0;i<n;i++){
        arr[i] = s.nextInt();
    }
    System.out.println("NOW ENTER THE ELEMENTS WHICH YOU WANT TO CHECK THE INDEX:");
    int x=s.nextInt();
    for(int i=0;i<arr.length;i++){
     if(arr[i]==x){
        System.out.println("INDEX IS:"+i);
        
     }
    }

    }
}
