import java.util.Arrays;

public class ArrayUtils3 {
    public static int[] rotateArray(int[] array, int positions) {
        int n = array.length;
        if (n == 0) return array;

        positions = positions % n;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[(i + positions) % n] = array[i];
        }
        return result;
    }
}
