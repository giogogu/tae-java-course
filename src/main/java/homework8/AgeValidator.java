/** @author Giorgi Gogua */
package homework8;

public class AgeValidator {

    public static void validate(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("არასწორი ასაკი: " + age);
        }

        System.out.println("ასაკი სწორია: " + age);
    }

    public static void main(String[] args) {
        int[] ages = {25, -5, 200};

        for (int age : ages) {
            try {
                validate(age);
            } catch (InvalidAgeException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
