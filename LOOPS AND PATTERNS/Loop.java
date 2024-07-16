import java.util.Scanner;

public class Loop {
   
    public static void main(String args[]){
        
        int n;
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER A NUMBER:");
        n=sc.nextInt();

        for(int i=0;i<n;i++){
            
            System.out.print("*");
        
        }
    }
    
} 