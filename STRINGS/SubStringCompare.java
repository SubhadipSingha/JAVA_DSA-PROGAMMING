package STRINGS;

import java.util.Scanner;

public class SubStringCompare {
    public static String Lexilogicalorder(int k,String s){
     String small = s.substring(0, k);
     String large = s.substring(0, k);

     for(int i=1;i<=s.length()-k;i++){
         String subString = s.substring(i, i+k);

         if(subString.compareTo(small)<0){
            small = subString;
         }
         else if(subString.compareTo(large)>0){
            large =  subString;
         }

     }

      return large +"\n"+ small;
    }



    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        String s = a.nextLine();
        int k = a.nextInt();
        System.out.print(Lexilogicalorder(k, s));
    }
}
