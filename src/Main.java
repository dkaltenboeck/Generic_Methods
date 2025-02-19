package src;

/**
 * Here is the main-class, which is necessary to test the GenericUtils class...
 * @author: Daniel Kaltenboeck
 */
public class Main {
    public static void main(String[]args) {
        Integer[] intNumbers = {1, 2, 3, 4, 5};
        String solution1 = GenericUtils.revers(intNumbers);
        double solution2 = GenericUtils.sum(intNumbers);
        System.out.println("The revers series is: " + solution1);
        System.out.println("The solution of the calculation of all Array-elements is: " + solution2);
    }
}
