/** @author გიორგი გოგუა */
package homework4;

public class EvenOddCounter {
    public static void main(String[] args) {
        int birthYear = 1993;
        int limit = birthYear % 100;

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 1; i <= limit; i++){
            if (i % 2 ==0){
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("დაბადების წელი: " + birthYear);
        System.out.println("ბოლო 2 ციფრი: " + limit);
        System.out.println("ლუწი: " + evenCount);
        System.out.println("კენტი: " + oddCount);
    }
}
