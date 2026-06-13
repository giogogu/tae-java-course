/** @author Giorgi Gogua */
package homework8;

public class InputValidator {

    public static int processAge(String input)
            throws NumberFormatException, IllegalArgumentException {

        int age = Integer.parseInt(input);

        if (age < 0) {
            throw new IllegalArgumentException("ასაკი არ შეიძლება იყოს უარყოფითი");
        }

        return age * 12;
    }

    public static void main(String[] args) {
        String[] inputs = {"25", "-5", "abc"};

        for (String input : inputs) {
            try {
                System.out.println(processAge(input));
            } catch (NumberFormatException e) {
                System.out.println("NumberFormatException: არ არის რიცხვი");
            } catch (IllegalArgumentException e) {
                System.out.println("IllegalArgumentException: " + e.getMessage());
            }
        }
    }
}
