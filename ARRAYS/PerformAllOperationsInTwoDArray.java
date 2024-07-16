package ARRAYS;

import java.util.Scanner;

public class PerformAllOperationsInTwoDArray {

    private static final String exit = null;

    public static void LargestAndLowest(int[][] arr) {
        int large = arr[0][0];
        int low = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > large) {
                    large = arr[i][j];
                } else if (arr[i][j] < low) {
                    low = arr[i][j];
                }
            }
        }
        System.out.println("LARGEST ELEMENT: " + large + "\nLOWEST ELEMENT: " + low);
    }

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
        for(int c =1; c<4;c++){
        System.out.println("NOW ENTER YOUR CHOICE : \n 1 FOR PRINTING THE ARRAY \n2 FOR FINDING A NUMBER \n3 FOR FINDING LARGEST AND THE LOWEST ELEMENT OF THE ARRAY ");

        int CHOICE = s.nextInt();
        switch (CHOICE) {
        case 1:
        System.out.println("NOW IT'S YOUR ARRAY :");
        for (int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(" ["+arr[i][j]+"] ");
            }
            System.out.println();
          } 
                break;

        case 2:
        System.out.println("SEARCH ANY NUMBERS INDEX:");
        int x = s.nextInt();
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i][j] == x){
                System.out.print("INDEX OF THIS NUMBER "+x+" IS "+(i+1)+","+(j+1));
                }
            }
            
        } 
        break;
        case 3:
        LargestAndLowest(arr);
            

        case 4:
        return;
        
        default:
                break;
        }
    }
        
}
}

