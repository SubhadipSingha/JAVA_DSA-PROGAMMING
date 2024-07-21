package ARRAYS;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE DIMENSION OF THE 2D ARRAY:");
       int n = s.nextInt();
       int m = s.nextInt();
        int [][] arr = new int[m][n];
        System.out.println("ENTER THE ELEMENTS OF THE 2D ARRAY:");
        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                 arr[i][j] = s.nextInt();
            }
        } 
        System.out.println("NOW IT IS YOUR 2D ARRAY:");
        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(" ["+arr[i][j]+"] ");
            }
            System.out.println();
        } 

        System.out.println("NOW IT IS YOUR 2D ARRAY:");
        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(" ["+arr[j][i]+"] ");
            }
            System.out.println();
        } 

    }
}
