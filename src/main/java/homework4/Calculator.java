/** @author გიორგი გოგუა */
package homework4;

public class Calculator {

    public static void main(String[] args) {
        double a = 10;
        double b = 0;

        char op = '/';

        switch (op) {
            case '+':
                System.out.println("შედეგი: " + (a + b));
                break;
            case '-':
                System.out.println("შედეგი: " + (a - b));
                break;
            case '*':
                System.out.println("შედეგი: " + (a * b));
                break;
            case '/':
                if (b == 0) {
                    System.out.println("შედეგი: ნულზე გაყოფა აკრძალულია!");
                } else {
                    System.out.println("შედეგი: " + (a / b));
                }
                break;
            default:
                System.out.println("შედეგი: უცნობი ოპერატორი");
        }

    }
}

