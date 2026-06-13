/** @author Giorgi Gogua */
package homework6;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": Bark!");
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Rex");
        dog.makeSound();
    }
}
