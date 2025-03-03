import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        var nums = new int[]{3,2,3};
        int target = 6;
        var result = twoSum(nums, target);
        System.out.println(STR."[\{result[0]}, \{result[1]}]");  // Output: [0, 1]
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[] {numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }
        return new int[]{};
    }
}
