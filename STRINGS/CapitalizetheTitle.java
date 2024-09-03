package STRINGS;

import java.util.Arrays;

public class CapitalizetheTitle {
    
    public static String capitalizeTitle(String title) {
        String[] words = title.split("\\s");
        System.err.println(Arrays.toString(words));
        for (int i = 0 ; i < words.length;  i++) {
         if(words[i].length()< 3) {
            words[i] = words[i].substring(0).toLowerCase();
         } else {
         words[i] = Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1).toLowerCase();
         }  
        }
        return String.join(" ", words);
        
    }
    public static void main(String[] args) {
        String title = "capiTalIze tHe titLe";
        System.out.println(capitalizeTitle(title));
    }
}
