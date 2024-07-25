package STRINGS;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        String str ="SUBHADIP";
        Scanner s=new Scanner(System.in);
        int n =s.nextInt();
        int i =s.nextInt();
        String name = str.substring(n,i);
        str.split(name, i)
        System.out.println(str +"-->"+ name);
    }
}
