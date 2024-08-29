package STRINGS;

import java.util.*;

public class EndOfFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "";
        int l = 1;
        while(sc.hasNext()){
           s = sc.nextLine();
            System.out.println(l+" "+s);
            l++;
        }
        sc.close();
        
       
    }
}
