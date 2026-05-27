/** @author გიორგი გოგუა */
package homework4;

public class PrimeCheck {
    public static void main(String[] args) {

        int age = 33;
        boolean isPrime = true;

        if (age < 2) {
            isPrime = false;
        }

        for (int i = 2; i <= age / 2; i++) {
            if (age % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println("ასაკი: " + age);
        if (isPrime) {
            System.out.println(age + " — მარტივი რიცხვია");
        } else {
            System.out.println(age + " — არ არის მარტივი რიცხვი");
        }
    }
}
