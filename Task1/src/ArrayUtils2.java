import java.util.HashMap;

public class ArrayUtils2 {
    public static int findDominant(int[] array) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        int n = array.length;

        for (int num : array) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            if (countMap.get(num) > n / 2) {
                return num;
            }
        }
        return -1;
    }
}
