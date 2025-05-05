
/*!: Two Sum
 * https://leetcode.com/problems/two-sum/
 * 
 * 
 */
public class TwoSum {
    public static void main(String[] args) {
        Solution solution= new Solution();
        int[] numbers = {3,2,4};

        // System.out.println(solution.twoSum(numbers, 6));
        for(int i: solution.twoSum(numbers, 6)) System.out.println(i);
    }
    
}
class Solution{

    public int[] twoSum(int[] nums, int target){
        for(int i=0;i<nums.length; i++){
            for(int j=1;j<nums.length;j++){
                if(nums[i]+nums[j]==target) {
                    return new int[]{i,j};
                    
                }
                
            }

        }
        throw new IllegalArgumentException("No two sum");

    }
}
