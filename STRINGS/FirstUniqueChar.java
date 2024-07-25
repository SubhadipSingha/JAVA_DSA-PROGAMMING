package STRINGS;

public class FirstUniqueChar {
    public static void firstUniqChar(String s) {
        int n = s.length();
        String str = "";
        while(str.length() == 0){
        for(int i=0;i<n-1;i++){
          if(s.charAt(i) == s.charAt(i+1) ){
             
             System.out.println(-1);
          }else if(s.charAt(i) != s.charAt(i+1)){
             str +=s.charAt(i);
             System.out.println(i+" "+str);
          }
        }
        s = str;
    }
        System.out.println(-1);;
     }
     public static void main(String[] args) {
         String s = "loveleetcode";
         firstUniqChar(s);
     }
}
