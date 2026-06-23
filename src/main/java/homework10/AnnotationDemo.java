/** @author Giorgi Gogua */
package homework10;

import java.lang.reflect.Method;

public class AnnotationDemo {
    @Author(name = "Giorgi")
    public void method1(){}

    @Author(name = "Gogua")
    public void method2(){}

    public static void main(String[] args) {

        Method[] methods = AnnotationDemo.class.getDeclaredMethods();

        for(Method method : methods){

            if(method.isAnnotationPresent(Author.class)){

                Author author =
                        method.getAnnotation(Author.class);

                System.out.println(
                        method.getName()
                                + " -> "
                                + author.name()
                );

            }

        }

    }
}
