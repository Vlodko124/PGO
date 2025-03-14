import java.util.Arrays;

public class RotateArray {
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
    public static void main(String[] args) {
        int[] testArray1 = {1, 2, 3, 4, 5};
        System.out.println("rotateArray: " + Arrays.toString(rotateArray(testArray1, 2)));

        int[] testArray2 = {1, 2, 3};
        System.out.println("rotateArray: " + Arrays.toString(rotateArray(testArray2, 3)));

        int[] testArray3 = {10, 20, 30, 40, 50};
        System.out.println("rotateArray: " + Arrays.toString(rotateArray(testArray3, 1)));
    }
}
