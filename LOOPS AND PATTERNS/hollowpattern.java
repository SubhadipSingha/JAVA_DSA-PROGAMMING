import java.util.Scanner;

public class hollowpattern {
    public static void main(String args[]) {
        int n=6;//m
     //   Scanner sc = new Scanner(System.in);
       // System.out.println("ENTER THE NUMBER OF ROWS:");
        //n = sc.nextInt();
        //System.out.println("ENTER THE NUMBER OF COLUMNS:");
        //m = sc.nextInt();
        
      for(int i=1; i<=n ; i++)
      {
        for(int j=1;j<=n-i;j++)
        {
            System.out.print(j);
        }

         for(int j=1; j==i ; j++)
        {
        
          System.out.print(" ");
            

        }
        System.out.println(" ");
        

      }
}
}

