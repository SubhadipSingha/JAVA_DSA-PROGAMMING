package FUNCTIONS;

class ChecksValidPerfectSquare{
    public static boolean ValidPerfectSquare(int num){
        if(num<0){
            return 0!=0;
        }
        double root = Math.sqrt(num);
         
        return  root== Math.floor(root);
     
    }
    public static void main(String[] args) {
        double root = Math.floor(Math.sqrt(16));
        System.out.println(ValidPerfectSquare(16) +""+root);
        
    }
}