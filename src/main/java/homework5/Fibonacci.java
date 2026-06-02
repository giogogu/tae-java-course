/** @author Giorgi Gogua */
package homework5;

public class Fibonacci {
    public static long fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        long previous = 0;
        long current = 1;

        for (int i = 2; i <= n; i++) {
            long next = previous + current;
            previous = current;
            current = next;
        }

        return current;
    }

    public static void main(String[] args) {
        int age = 33;
        System.out.println(fib(age));
    }
}
