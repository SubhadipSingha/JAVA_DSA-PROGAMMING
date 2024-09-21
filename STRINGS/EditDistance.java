package STRINGS;

public class EditDistance {

    public static int minDistance(String word1, String word2) {
        int count = 0;
        if(word1.length() == 0) return 0;
      for(int i = 0 ; i < word1.length() ; i++){
        for(int j = 0 ; j < word1.length() ; j++){
          if (word1.indexOf(word1.substring(i, i+1)) != word2.indexOf(word2.substring(j, j+1)) ){
            count++;
            System.out.print(word1.substring(i, i+1));
           
          }else if(word1.indexOf(word1.substring(i, i+1)) == word2.indexOf(word2.substring(j, j+1)) ) {
            count--;
          }
          break;
        }
      }
        
        
        return count;
        
    }
    public static void main(String[] args) {
        System.out.println(minDistance("intention", "execution"));
    }
}
