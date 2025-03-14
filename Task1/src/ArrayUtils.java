import java.util.ArrayList;

public class ArrayUtils {
    public static int[] filterEvenIndexOddValue(int[] array) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < array.length; i += 2) {
            if (array[i] % 2 != 0) { 
                result.add(array[i]);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
