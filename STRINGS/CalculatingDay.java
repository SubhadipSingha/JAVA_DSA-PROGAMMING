package STRINGS;

import java.util.Arrays;

public class CalculatingDay {
    public static String[] dayOfYear(String date){
        String[] d = date.split("-" );
        int[] n = new int[d.length];
        
        int day = 0;
        for(int i = 0; i< d.length ;i++) {
            if(){
                day += d1.charAt(2);
            }
                }

        
        return d;
        
    }
    public static void main(String[] args) {
        String date = "2019-01-09";
        System.out.println(Arrays.toString(dayOfYear(date)));
    }
}
