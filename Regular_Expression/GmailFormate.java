package Regular_Expression;

public class GmailFormate {
    public static void main(String[] args) {
        String Email = "SubhadipSingha05@gmail.com";
        System.out.println(Email.matches(".*gmail.*"));
        //.*defines any charracters or words
        System.out.println(Email.matches("\\W*@gmail(.*)"));
        //\\W any words for any numbers of time no number 
        if(Email.matches("\\w*@gmail(.*)")){
            System.out.println("valid");
        }else{
            System.out.println("Invalid");
        }
    }
}
