package STRINGS;

public class CounttheNumberofConsistentStrings {
   
    public static int countConsistentStrings(String allowed, String[] words) {
       int  count = 0;
       
       for( String word : words){
        boolean valid =true;
        for(char w : word.toCharArray()){
            if(allowed.indexOf(w) == -1){
                valid = false;
                break;
            }
        }
        if(valid) count++;
       } 
       
        return count;
    }
   
   
    public static void main(String[] args) {
       String allowed = "ab", words[] = {"a","b","c","ab","ac","bc","abc"};
        System.out.println(countConsistentStrings(allowed, words));
    }
}
