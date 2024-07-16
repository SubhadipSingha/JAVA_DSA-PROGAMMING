package RECURSION;

public class KeywordCombination {
    public static String[] keyword = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void keywordcomb(String str,int idx,String combination){
     if(idx==str.length()){
        System.out.println(combination);
        return;
     }
        char curchar = str.charAt(idx);
        String mapping = keyword[curchar - '0'];

         for(int i =0 ;i<mapping.length();i++){
          keywordcomb(str, idx+1, combination+mapping.charAt(i));
         }
    }
    public static void main(String[] args) {
        String str ="233";
        keywordcomb(str, 0, "");
    }
}
