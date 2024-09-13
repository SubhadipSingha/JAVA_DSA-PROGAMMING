package STRINGS;

import java.util.Arrays;
import java.util.HashMap;

import PRACTICE.A;

public class WordSearch {
    public static  boolean exist(char[][] board, String word) {
        HashMap<Integer ,char[]> boardcontent = new HashMap<>();
        int i = 0;
        for (char[] c : board) {
            boardcontent.put(i, c);
            i++;
        }
      int   count = 0;
      boolean[][] visited = new boolean[board.length][board[0].length];
      for (char c : word.toCharArray()) {
        int k = 0;
        boolean found = false , adjacents = c > 0;

        while (k < board.length) {
            char[] content = boardcontent.get(k); 
            for (i = 0; i < content.length; i++) { 
             if(adjacents && (i > 0 && !visited[k][i-1]) && (i < content.length - 1 && !visited[k][i+1]) 
             && (k > 0 && !visited[k-1][i]) && (k < board.length - 1 && !visited[k+1][i])){
                continue;
             }



                if (c == content[i] && !visited[k][i]) { 
                    count++;
                    visited[k][i] = true;
                    found = true;
                    // System.out.println(content[i]); 
                    break; 
                }
            }
            if (found) { 
                break;
            }
            k++;
        }
        if(!found) return false;
    }
        // for(boolean[] b : visited){
        //     System.out.println(Arrays.toString(b));
        // }
        // System.out.println(count);
        return count == word.length();
        
    }
    public static void main(String[] args) {
       char board[][] = {{'a','b'},{'c','d'}} ; 
       String word = "abcd";
       System.out.println(exist(board, word));
    }
}
