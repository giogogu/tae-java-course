/** @author გიორგი გოგუა */
package homework4;

public class SumOfDigits {
    public static void main(String[] args) {
        int birthYear = 1993;
        int number = birthYear;
        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        System.out.println("დაბადების წელი: " + birthYear);
        System.out.println("ციფრების ჯამი: " + sum);
    }
}
