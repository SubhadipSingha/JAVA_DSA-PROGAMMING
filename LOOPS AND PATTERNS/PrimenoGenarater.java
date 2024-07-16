import java.util.Scanner;

public class PrimenoGenarater {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE STARTING AND THE ENDING LIMIT OF THE PRIME NUMBERS :");
        int n=s.nextInt();
        int l=s.nextInt();
         System.out.println("HERE THE PRIME NUMBERS ARE:");
        for(int i=n;i<=l;i++){
           if(i%1==0 && i%2!=0){
            System.out.print(" "+i);
            
           }
        }
    }
}
