public class diamondpattern {
    public static void main(String[] args) {
        
        int n=6;
        for(int i=1; i<=n; i++)//outer loop
        {
            //loop for the 1st half
            for(int j=n-i;j>=1;j--)
            {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--)
            {
                System.out.print(" *");
            }
            System.out.println();
            
        } 
        //loop for the 2nd half
        for(int i=n-1; i>=1; i--)//outer loop
        {
            //loop for the 1st half
            for(int j=n-i;j>=1;j--)
            {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--)
            {
                System.out.print(" *");
            }
            System.out.println();
            
        } 
    }
}
