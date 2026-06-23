/** @author Giorgi Gogua */
package homework10;

import java.util.List;
import java.util.stream.Collectors;

public class MethodRef {
    public static void main(String[] args) {

        List<String> names = List.of("Anna", "Beka", "Cita");

        names.forEach(System.out::println);

        List<String> upper = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(upper);

        List<Integer> nums = List.of("1", "2", "3")
                .stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println(nums);

    }

}
