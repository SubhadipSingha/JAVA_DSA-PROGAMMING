import java.util.Scanner;

public class GreatestOfThreeNumb {
    public static void GreatestOfThree(int a,int b,int c){
       if(a>b && a>c){
        System.out.println("NUMBER ONE IS THE GREATEST");
       }
       else if(b>a && b>c)
       {
        System.out.println("NUMBER TWO IS THE GREATEST");
       }
       else {
        
            System.out.println("NUMBER THREE IS THE GREATEST");
           
       }
      return;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THREE NUMBERS:");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();

        GreatestOfThree(a, b, c);


    }
}
