package STRINGS;

public class IntegerTOWords {

   static String[] Less_Than_20 = {"","one","two","three","four","five","six","seven","eight","nine","Ten",
    "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"}; 
 static String[] Tens = { "" , "","twenty","thirty","forty","fithty","sixty","seventy","eighty","ninety"};
static String[] Thousands = {"" , "thousand" , "million" , "billion" };
public static String numberToWords(int num) {
    if (num == 0) {
        return "Zero";
    }
    int i = 0;
    String words = "";
    while (num > 0) {
        if (num % 1000 != 0) {
            words = helper(num % 1000) + Thousands[i] + " " + words;
        }
        num /= 1000;
        i++;
    }
    return words.trim();
}

public static String helper(int num) {
    if (num == 0) {
        return "";
    } else if (num < 20) {
        return Less_Than_20[num] + " ";
    } else if (num < 100) {
        return Tens[num / 10] + " " + helper(num % 10);
    } else {
        return Less_Than_20[num / 100] + " Hundred " + helper(num % 100);
    }
}

    public static void main(String[] args) {
        int num = 123;
        System.out.println(numberToWords(num));
    }
}
