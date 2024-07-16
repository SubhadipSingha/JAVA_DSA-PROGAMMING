package STRINGS;
public class OucurrenceOfAChar{
   public static int first = -1;
   public static int last = -1;
    public static void checkocurrence(String str,char element){
       for(int i=0;i<=str.length()-1;i++){
        char currchar = str.charAt(i);
          if(currchar == element){
           if(first== -1){
             first = i;
           }else{
            last = i;
           }
          }
       }System.out.println(first);
       System.out.println(last);
    }
    public static void main(String[] args) {
        String str = "aacdegjhaaeda";
        checkocurrence(str,'a' );
    }
}