package STRINGS;

public class AddCharAtLast {
    public static void Addchar(String str,char element){
        String newStr ="";
        int count = 0;
        for (int i=0;i<str.length();i++){
            char currChar =  element ;
          if(currChar == str.charAt(i)){
            count +=1;
          }else{
            newStr += str.charAt(i);
          }
        }
        System.out.println("before adding "+newStr);
       
      for(int i=0;i<count;i++){
        newStr += element;
      }
      System.out.println("after adding "+newStr);
    }
    public static void main(String[] args) {
        String str = "asdxxwexxawx";
        Addchar(str, 'a');
    }
}
