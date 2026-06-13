/** @author Giorgi Gogua */
package homework6;

public class Person {
    private String name;
    private int age;
    private String email;

    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void introduce() {
        System.out.println("გამარჯობა, მე ვარ " + name + ", " + age + " წლის.");
    }

    public static void main(String[] args) {
        Person p1 = new Person("Giorgi", 33, "giorgi@gmail.com");
        Person p2 = new Person("Ana", 25, "ana@gmail.com");

        p1.introduce();
        p2.introduce();
    }
}
