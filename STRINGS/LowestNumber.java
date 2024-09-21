package STRINGS;

import java.util.Arrays;

public class LowestNumber {
    
    public static String lowestnumber(int[] nums){
      StringBuilder ans = new StringBuilder();
      String[] num = new String[nums.length];
      int i = 0;
      for(int n : nums){
        num[i] = Integer.toString(n);
        i++;
      }
      Arrays.sort(num , (String a, String b) -> (a+b).compareTo(b+a));
      if(num[0].equals("0")) return "0";
      for (String s  : num) {
          ans.append(s);
      }
      
        return ans.toString();
    }

    public static String largestnumber(int[] nums){
        StringBuilder ans = new StringBuilder();
        String[] num = new String[nums.length];
        int i = 0;
        for(int n : nums){
          num[i] = Integer.toString(n);
          i++;
        }
        Arrays.sort(num , (String a, String b) -> (b+a).compareTo(a+b));
        if(num[0].equals("0")) return "0";
        for (String s  : num) {
            ans.append(s);
        }
        
          return ans.toString();
      }
  
  
      public static String numbers(int[] nums){
        StringBuilder ans = new StringBuilder();
        String[] num = new String[nums.length];
        int i = 0;
        for(int n : nums){
          num[i] = Integer.toString(n);
          i++;
        }
        Arrays.sort(num , (String a, String b) -> (a).compareTo(b));
        if(num[0].equals("0")) return "0";
        for (String s  : num) {
            ans.append(s).append(" ");
        }
        
          return ans.toString();
      }
  

    public static void main(String[] args) {
        int[] nums = {6,7,8};
        System.out.println(lowestnumber(nums));
        System.out.println(largestnumber(nums));
        System.out.println(numbers(nums));
    }
}
