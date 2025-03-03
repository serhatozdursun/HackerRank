import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestSubarray {

    public static void main(String[] args) {
        List<Integer> nums1 = Arrays.asList(1, 2, 3, 4, 5);

        System.out.println(longestSubarray(nums1)); // Output: 7
    }

    /*
     * Complete the 'longestSubarray' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int longestSubarray(List<Integer> arr) {
        if (arr == null || arr.isEmpty()) {
            return 0;
        }

        int[] nums = arr.stream().mapToInt(Integer::intValue).toArray();

        int maxLength = 0;
        int left = 0;
        Map<Integer, Integer> map = new HashMap<>(); // To count occurrences of each number

        // Iterate through the array with a sliding window
        for (int right = 0; right < nums.length; right++) {
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            // Maintain the condition that there are at most 2 distinct values
            while (map.size() > 2) {
                map.put(nums[left], map.get(nums[left]) - 1);
                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
