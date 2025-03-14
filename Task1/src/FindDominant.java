import java.util.HashMap;

public class FindDominant {
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
    public static void main(String[] args) {
        int[] testArray1 = {3, 3, 3, 2, 2};
        System.out.println("findDominant: " + findDominant(testArray1));

        int[] testArray2 = {1, 2, 3, 4};
        System.out.println("findDominant: " + findDominant(testArray2));

        int[] testArray3 = {5, 5, 5, 5, 1};
        System.out.println("findDominant: " + findDominant(testArray3));
    }
}
