package STRINGS;

public class CalculatingDay {
    public static int dayOfYear(String date){
        String[] d = date.split("-" );
        int[] n = new int[d.length];
        int n1  =  Integer.parseInt(d[0]);
      
        return n1;
        
    }
    public static void main(String[] args) {
        String date = "2019-01-09";
        System.out.println((dayOfYear(date)));
    }
}
