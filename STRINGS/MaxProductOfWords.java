package STRINGS;

public class MaxProductOfWords {
    public static int maxProduct(String[] words) {
       int n = words.length;
       int[] masks = new int[n];
       int[] length = new int[n];
       for(int i = 0; i<n;i++){
        int mask = 0 ;
          for(char c:words[i].toCharArray()){
            mask |= (1<<(c-'a'));
          }
          masks[i] = mask;
          length[i] = words[i].length();
       }
     
       int ans =0 ;
       for(int i = 0 ;  i< n;i++){
        for(int j = i+1;j<n;j++){
            if((masks[i] & masks[j]) == 0 ){
                ans = Math.max(ans, length[i] * length[j]);
            }
        }
       }
       return ans;
    }
    public static void main(String[] args) {
      String  words[] = {"abcw","baz","foo","bar","xtfn","abcdef"};
      System.out.println(maxProduct(words));
    }
}
