import java.util.Scanner;

public class natural {
   
    public static void main(String args[]){
        
        int n;
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER A NUMBER:");
        n=sc.nextInt();
        int SUM=0;
        for(int i=1;i<=n;i++){
            
            SUM = SUM +i;
        
        }
        System.out.println(SUM);
    }
    
} 