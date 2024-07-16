package FUNCTIONS;
   import java.util.Scanner;
    
public class EvenOrOdd {
  
        public static void Even(int n){
            if(n%2==0){
                System.out.println("THIS NUMBERS: "+n+" IS EVEN");
            }else{
                System.out.println("THIS NUMBERS: "+n+" IS NOT EVEN");
            }
               return ;
        }
    
        public static void main(String args[]){
            Scanner s=new Scanner(System.in);
            System.out.println("ENTER THE NUMBER:");
            int n=s.nextInt();
            Even(n);
            
        }
    }
    
