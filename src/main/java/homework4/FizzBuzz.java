/** @author გიორგი გოგუა */
package homework4;

public class FizzBuzz {

    public static void main(String[] args) {

        int age = 33;

        for(int i = age; i <= age * 3; i++){

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz " + i);

            } else if (i % 5 == 0) {
                System.out.println("Buzz: " + i);
                
            } else if (i % 3 == 0 ) {
                System.out.println("Fizz: " + i);
                
            } else {
                System.out.println(i);
            }

        }

    }

}
