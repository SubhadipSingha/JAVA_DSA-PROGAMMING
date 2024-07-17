package STRINGS;

public class ASCIIValueDiffSum {
    public static int ValueofSum(String s){
    
    int sum =0;
    for(int i=0;i<s.length()-1;i++){
        char currentchar = s.charAt(i);
        char nextchar = s.charAt(i+1);
        sum += Math.abs((int)currentchar - (int)nextchar);
    }
    return sum;
    }
    public static void main(String[] args) {
        int ascii = ValueofSum("zaz");
        
           System.out.println(ascii);
       
    }
}
