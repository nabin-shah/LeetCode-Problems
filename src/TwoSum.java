
/*!: Two Sum
 * https://leetcode.com/problems/two-sum/
 * 
 * 
 */
public class TwoSum {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        int[] numbers = { 3, 2, 4 };

        // System.out.println(solution.twoSum(numbers, 6));
        for (int i : solution.twoSum(numbers, 6))
            System.out.println(i);
    }

}

class Solution {

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };

                }
            }

        }
        throw new IllegalArgumentException("No two sum");
    }
}

// Alternative Solution: O(n) solution using HashMap
class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        
        java.util.Map<Integer, Integer> map = new java.util.HashMap<>();

       
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement needed to hit the target
            int complement = target - nums[i];

            // If we find the complement in the map, return the indices
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // Otherwise, store the current value with its index
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two Sum");

    }

}
