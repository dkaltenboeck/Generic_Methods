package src;
/**
 * Utility class for generic operations.
 */
public class GenericUtils {
    /**
     * Reverses the given array in-place.
     *
     * @param <T> The type of elements in the array.
     * @param array The array to be reversed.
     */
    public static <T> String revers(T[] array) {
        String finishArray = "";
        if(array.length < 0) {
            return ""; // If the length of the array is incorrect and doesn't work, I have to return null...
        }
        int left = 0;
        int right = array.length -1;

        while(left < right) {
            T spaceL = array[left];
            array[left] = array[right];
            array[right] = spaceL;

            left++;
            right--;
        }
        for(int i = 0; i < array.length; i ++) {
            T element = array[i];
            finishArray = finishArray + element.toString() + ", ";
        }
        return finishArray;
    }

    /**
     * Calculates the sum of all elements in the given array.
     * Only allows elements that are subclasses of Number.
     *
     * @param <T> The type of elements in the array, must extend Number.
     * @param array The array of numbers to sum up.
     * @return The sum of all elements in the array as a double.
     */
    public static <T extends Number> double sum(T[] array) {
        if (array == null || array.length == 0) {
            return 0.0; // Return 0 if array is null or empty
        }
        double recent;
        double total = 0.0;
        for(int zaehler = 0; zaehler < array.length; zaehler ++) {
            T rNumber = array[zaehler];
            recent = rNumber.doubleValue();
            total = total + recent;
        }

        return total;
    }


}
