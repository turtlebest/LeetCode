public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int closest = Integer.MAX_VALUE - 1;
        
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length; i++) {
            int j = i+1;
            int k = nums.length - 1;
            
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                
                if (Math.abs(target - sum) < Math.abs(target - closest)) {
                    closest = sum;
                }
                
                if (sum < target) {
                    j++;
                } else if (sum > target) {
                    k--;
                } else if (sum == target) {
                    return sum;
                }
            }
        }
        
        return closest;
    }
    
}