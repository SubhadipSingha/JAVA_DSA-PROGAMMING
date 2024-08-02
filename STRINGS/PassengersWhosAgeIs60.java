package STRINGS;

public class PassengersWhosAgeIs60 {
    public static int FindTheAges(String[] details){
       int count  = 0 ;
       int[] age = new int[details.length];
        for(int i = 0 ; i < details.length ; i++){
              String  person = details[i].substring(11, 13);
              age[i] = Integer.parseInt(person);
              if(age[i] > 60){
                count++;
              }
        }
       
       
        return count;
        
    }
    public static void main(String[] args) {
        String[] details = {"7868190130M7522","5303914400F9211","9273338290F4010"};
        System.out.println(FindTheAges(details));
    }
}
