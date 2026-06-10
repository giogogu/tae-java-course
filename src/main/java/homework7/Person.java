/** @author Giorgi Gogua */
package homework7;

import java.util.Arrays;

public class Person implements Comparable<Person> {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }

    public static void main(String[] args) {
        Person[] people = {
                new Person("Anna", 25),
                new Person("Beka", 30),
                new Person("Cita", 22),
                new Person("Giorgi", 33)
        };

        Arrays.sort(people);

        for (Person person : people) {
            System.out.println(person);
        }
    }
}
