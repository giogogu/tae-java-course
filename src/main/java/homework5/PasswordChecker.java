/** @author Giorgi Gogua */
package homework5;

public class PasswordChecker {
    public static boolean isStrong(String password) {
        boolean hasDigit = false;
        boolean hasUpperCase = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isDigit(ch)) {
                hasDigit = true;
            }

            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            }
        }

        return password.length() >= 8 && hasDigit && hasUpperCase;
    }

    public static void main(String[] args) {
        System.out.println(isStrong("Hello123"));
    }
}
