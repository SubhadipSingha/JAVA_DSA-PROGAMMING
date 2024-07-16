package STRINGS;

public class DeleteTheDuplicates {
    public static void Delete(String str){
        String newstr = "";
        for(int i=0;i<str.length()-1;i++){
          char currchar = str.charAt(i);
          if(currchar != str.charAt(i+1)){
            newstr += str.charAt(i);
          }

        }
        System.out.println(newstr);
    }
    public static void main(String[] args) {
        String str = "deefrddd";
        Delete(str);
    }
}
