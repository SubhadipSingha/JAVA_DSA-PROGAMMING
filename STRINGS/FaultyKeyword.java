package STRINGS;

public class FaultyKeyword {
    public static void main(String[] args) {
        String s = "poiienter";
        StringBuilder ans = new StringBuilder();
        for(char c:s.toCharArray()){
            System.out.println(ans);
            if(c == 'i'){
               ans =  ans.reverse();
            }else {
                ans.append(c);
            }
            System.out.println(ans);
        }
                

    }
}
