package ARRAYS;

import java.util.Scanner;

public class PrintIndexInTwoDArray {
     public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE DIMENSION OF THE 2D ARRAY:");
       int n = s.nextInt();
       int m = s.nextInt();
        int [][] arr = new int[n][m];
        System.out.println("ENTER THE ELEMENTS OF THE 2D ARRAY:");
        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                 arr[i][j] = s.nextInt();
            }
        } 
        System.out.println("SEARCH ANY NUMBERS INDEX:");
        int x = s.nextInt();
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i][j] == x){
                System.out.print("INDEX OF THIS NUMBER "+x+" IS "+(i+1)+","+(j+1));
                }
            }
            
        } 
    }
}
