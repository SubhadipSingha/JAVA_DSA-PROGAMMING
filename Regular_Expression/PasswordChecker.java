package Regular_Expression;


// It has at least 6 characters and at most 20 characters.
// It contains at least one lowercase letter, at least one uppercase letter, and at least one digit.
// It does not contain three repeating characters in a row (i.e., "Baaabb0" is weak, but "Baaba0" is strong).
// Given a string password, 
// return the minimum number of steps required to make password strong.
//  if password is already strong, return 0.





public class PasswordChecker {
    public static int strongPasswordChecker(String password) {
        int length = password.length();
        boolean hasLower = false, hasUpper = false, hasDigit = false;
        int missingTypes = 3; 
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) hasLower = true;
            if (Character.isUpperCase(c)) hasUpper = true;
            if (Character.isDigit(c)) hasDigit = true;
        }
        if (hasLower) missingTypes--;
        if (hasUpper) missingTypes--;
        if (hasDigit) missingTypes--;

        int repeatChanges = 0;
        for (int i = 2; i < length; i++) {
            if (password.charAt(i) == password.charAt(i - 1) && password.charAt(i - 1) == password.charAt(i - 2)) {
                repeatChanges++;
                i += 2; 
            }
        }

        if (length < 6) {
          
            return Math.max(6 - length, missingTypes);
        } else if (length > 20) {
         
            return length - 20 + Math.max(repeatChanges, missingTypes);
        } else {
         
            return Math.max(repeatChanges, missingTypes);
        }
    }

    public static void main(String[] args) {
        String password = "B390233jorwrjrwr";
        // System.out.println(password.matches("^(?=.[a-zA-Z]{2}[0-9])[a-zA-Z0-9]{6,20}$"));
        System.out.println(strongPasswordChecker(password));
    }
}
