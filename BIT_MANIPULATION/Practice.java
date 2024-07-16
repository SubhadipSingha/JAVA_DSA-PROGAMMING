package BIT_MANIPULATION;

import java.util.Scanner;

public class Practice {
    public static void main(String args[]){
     int n=5 , choice;
     int pos = 2;
    System.out.println("ENTER YOUR CHOICE:\n1 - FOR GET BIT\n2- SET BIT \n3 - CLEAR BIT\n4 - UPDATE BIT");
    Scanner s= new Scanner(System.in);
    choice = s.nextInt();
   
    int mask = 1 << pos ; 
     switch (choice) {
        case 1:
        int ans1 = (mask & n);
        System.out.println(ans1);
        break;
        case 2:
        int ans2 = (mask | n);
        System.out.println(ans2);
        break;
        case 3:
        int notvalue = ~(mask);
        int ans3 = (notvalue & n);
        System.out.println(ans3);
        break;
        case 4:
        System.out.println("WHAT YOU WANT TO UPDATE:\nENTER 1 FOR 1->0\nENTER 0 FOR 0 -> 1");
        int i = s.nextInt();
        if (i == 1 ) {
            int notvalue1 = ~(mask);
            int ans4 = (notvalue1 & n);
            System.out.println(ans4);
        }else if( i == 0){
            int ans5 = (mask | n);
        System.out.println(ans5);
        }

        break;   
     
        default:
            break;
     }
    

    }
}
