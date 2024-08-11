package Regular_Expression;

public class FindOutValidGmailOrNot {
    public static String FindoutValidOrNot(String email){
        String result = "";
    
        int i =email.indexOf('@');
        if(i == -1){
            return "Gmail is InValid";
        }
        String user = email.substring(0, i);
        String domain = email.substring(i, email.length());
        System.out.println("UserName: "+user+"\tDomainName: "+domain);
        if(user.matches("[a-z0-9]+") && domain.matches("@gmail.com")){
            result = "Gmail is Valid";
        }else{
            result = "Gmail is InValid";
        }
        
        return result;
    }
    
    
    
    
    public static void main(String[] args) {
        String email = "@gmail.com";
        String email1 = "subha_05@gmail.com";
        String email2 = "subha@gmail.com";
        System.out.println(FindoutValidOrNot(email2));


    }
}
