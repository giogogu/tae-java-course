/** @author Giorgi Gogua */
package homework5;

public class NumberClassifier {
    public static String classify(int n) {
        if (n > 0) return "Positive";
        else if (n < 0) return "Negative";
        else return "Zero";
    }

    public static String classify(double n) {
        String type;

        if (n > 0) type = "Positive";
        else if (n < 0) type = "Negative";
        else type = "Zero";

        if (n % 1 == 0) {
            return type + " · Whole double";
        } else {
            return type + " · Decimal";
        }
    }

    public static void main(String[] args) {
        System.out.println(classify(-5));
        System.out.println(classify(3.14));
        System.out.println(classify(7.0));
    }
}
