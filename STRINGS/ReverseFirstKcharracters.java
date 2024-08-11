package STRINGS;

public class ReverseFirstKcharracters {
    
    
    public static String reverseStr(String s, int k) {
       
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i+=2*k) {
            int st = i;
            int e = Math.min(i+k-1,ch.length-1);
            while(st < e){
                char temp = ch[st];
                ch[st] = ch[e];
                ch[e] = temp;
                st++;
                e--;
            }

        }
        return new String(ch);
        
    }

   
    public static void main(String[] args) {
        System.out.println(reverseStr("abcdertg", 2));
    }
}
