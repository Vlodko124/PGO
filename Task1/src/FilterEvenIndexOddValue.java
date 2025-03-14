import java.util.ArrayList;
import java.util.Arrays;

public class FilterEvenIndexOddValue {

    public static int[] filterEvenIndexOddValue(int[] array) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < array.length; i += 2) {
            if (array[i] % 2 != 0) {
                result.add(array[i]);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        int[] testArray1 = {1, 2, 3, 4, 5, 6};
        System.out.println("filterEvenIndexOddValue: " + Arrays.toString(filterEvenIndexOddValue(testArray1)));

        int[] testArray2 = {2, 3, 4, 5, 6, 7};
        System.out.println("filterEvenIndexOddValue: " + Arrays.toString(filterEvenIndexOddValue(testArray2)));

        int[] testArray3 = {7, 8, 9, 10, 11};
        System.out.println("filterEvenIndexOddValue: " + Arrays.toString(filterEvenIndexOddValue(testArray3)));
    }
}
