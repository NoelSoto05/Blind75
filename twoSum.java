import java.util.HashMap;
import java.util.Arrays;

public class twoSum {

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> complements = new HashMap<>();
        int currentNumber = 0;
        int complement = 0;

        int solution[] = { 0, 0 };

        for (int i = 0; i < nums.length; i++) {

            currentNumber = nums[i];
            complement = (target - nums[i]);

            if (complements.containsKey(currentNumber)) {
                solution[0] = complements.get(currentNumber);
                solution[1] = i;
                return solution;
            }

            complements.put(complement, i);

        }

        return solution;

    }

    public static void main(String[] args) {

        int[] testCase1 = { 2, 7, 11, 15 };
        int[] testCase2 = { 3, 2, 4 };

        System.out.println("The result is " + Arrays.toString(twoSum(testCase1, 9)));
        System.out.println("The result is " + Arrays.toString(twoSum(testCase2, 6)));

    }
}
