/** @author Giorgi Gogua */
package homework9;

public class GenericBox<T> {
    private T value;

    public GenericBox(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    public void set(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        GenericBox<String> stringBox = new GenericBox<>("Hello");
        GenericBox<Integer> integerBox = new GenericBox<>(42);
        GenericBox<Double> doubleBox = new GenericBox<>(3.14);

        System.out.println("String box: " + stringBox.get());
        System.out.println("Integer box: " + integerBox.get());
        System.out.println("Double box: " + doubleBox.get());
    }
}
