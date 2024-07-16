package RECURSION;

public class Subsequence {
    public static void sequence(String str,int idx,String newstr){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }
       char  curchar = str.charAt(idx);
       //to be added
        sequence(str, idx+1, newstr+curchar);
        //not to be added
        sequence(str, idx+1, newstr);
    }
    public static void main(String[] args) {
        String str ="abc";
        sequence(str, 0, "");
    }
}
