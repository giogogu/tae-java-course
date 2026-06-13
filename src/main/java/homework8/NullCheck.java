/** @author Giorgi Gogua */
package homework8;

public class NullCheck {
    public static int safeLength(String s) {
        try {
            return s.length();
        } catch (NullPointerException e) {
            System.out.println("null სტრიქონი");
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(safeLength("Hello"));
        System.out.println(safeLength(null));
    }
}
