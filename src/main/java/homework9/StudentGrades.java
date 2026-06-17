/** @author Giorgi Gogua */
package homework9;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentGrades {
    private static HashMap<String, List<Integer>> grades = new HashMap<>();

    public static double averageFor(String name) {
        List<Integer> studentGrades = grades.get(name);

        int sum = 0;

        for (int grade : studentGrades) {
            sum += grade;
        }

        return (double) sum / studentGrades.size();
    }

    public static void main(String[] args) {
        grades.put("Anna", Arrays.asList(85, 92, 78, 90));
        grades.put("Beka", Arrays.asList(70, 65, 80, 75));
        grades.put("Cika", Arrays.asList(95, 98, 92, 100));

        for (Map.Entry<String, List<Integer>> entry : grades.entrySet()) {
            String name = entry.getKey();
            System.out.println(name + ": " + entry.getValue() + " avg=" + averageFor(name));
        }
    }
}
