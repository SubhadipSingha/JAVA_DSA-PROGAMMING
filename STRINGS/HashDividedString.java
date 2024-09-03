package STRINGS;

public class HashDividedString {
   
    public static String stringHash(String s, int k) {
        StringBuilder result = new StringBuilder();
        int n = s.length();
    
        // Iterate through the string in chunks of length k
        for (int i = 0; i < n; i += k) {
            String substring = s.substring(i, i + k);
            int sum = 0;
    
            // Calculate the sum of the hash values of the characters in the substring
            for (char c : substring.toCharArray()) {
                sum += c - 'a'; // Hash value of 'a' is 0, 'b' is 1, ..., 'z' is 25
            }
    
            // Find the corresponding character for the hashed value
            int hashedChar = sum % 26;
            char resultChar = (char) ('a' + hashedChar);
    
            // Append the character to the result string
            result.append(resultChar);
        }
    
        return result.toString();
        
    }
   
    public static void main(String[] args) {
        
    }
}
