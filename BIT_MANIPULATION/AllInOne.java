package BIT_MANIPULATION;

import java.util.Scanner;

public class AllInOne {
  
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER:");
        int n =s.nextInt();
        System.out.println("ENTER THE POSITION:");
        int p =s.nextInt();
        int bitmask = 1<<p;
        System.out.println("ENTER THE OPTION :\n1 FOR PERFORM GETBIT\n2 FOR PERFORM SETBIT\n 3 FOR CLEAR BIT\n 4 FOR UPDATE");
        int OPTION =s.nextInt();
        switch (OPTION) {
            case 1:
                int newnumber = (bitmask & n);
                System.out.println(newnumber);
                break;

            case 2:
                int number = (bitmask | n);
                System.out.println(number);
                break; 
                 
            case 3:
            int not = ~(bitmask);
                int numb = ( not & n );
                System.out.println(numb);
                break;

            case 4:
                System.out.println("NOW ENTER 1 FOR UPDATE 0 TO 1\n ENTER 0 FOR UPDATE 1 TO 0");
            int c =s.nextInt();
            if(c==1){
                int num1 = (bitmask | n);
                System.out.println(num1); 
            }else{
                int notvalue = ~(bitmask);
                int numb2 = ( notvalue & n );
                System.out.println(numb2);
            }
                
                break;
        
            default:
                break;
        }
    }
}

