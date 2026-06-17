/** @author Giorgi Gogua */
package homework9;

import java.util.ArrayList;
import java.util.List;

public class NumberStats {
    public static int findMax(List<Integer> list) {
        int max = list.get(0);

        for (int number : list) {
            if (number > max) {
                max = number;
            }
        }

        return max;
    }

    public static int findMin(List<Integer> list) {
        int min = list.get(0);

        for (int number : list) {
            if (number < min) {
                min = number;
            }
        }

        return min;
    }

    public static double average(List<Integer> list) {
        int sum = 0;

        for (int number : list) {
            sum += number;
        }

        return (double) sum / list.size();
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(25);
        numbers.add(7);
        numbers.add(40);
        numbers.add(15);

        System.out.println("Max: " + findMax(numbers));
        System.out.println("Min: " + findMin(numbers));
        System.out.println("Average: " + average(numbers));
    }
}
