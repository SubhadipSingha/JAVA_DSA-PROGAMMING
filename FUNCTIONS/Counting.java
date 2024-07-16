package FUNCTIONS;
import java.util.Scanner;
public class Counting {
   
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int p=0;
        int n=0;
        int z=0;
        System.out.println("ENTER THE COUNT OF HOW MANY TIMES YOU WANT TO ENTER A NUMBER:");
        int c=s.nextInt();
        for(int i=1;i<=c;i++){
            System.out.println("ENTER THE NUMBER:");
            int num =s.nextInt();
        if (num>0) {
            p++;
        } else if(num<0) {
            n++;
        }else{
            z++;
        }

        }
        System.out.println("COUNT OF POSITIVES:"+p);
        System.out.println("COUNT OF NEGATIVES:"+n);
        System.out.println("COUNT OF ZEROS:"+z);
    }




}

