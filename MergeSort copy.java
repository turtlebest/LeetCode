public class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int i = 1;
        
        while (i < nums.length) {
            if (nums[i] == nums[k]) {
                i++;
            } else {
                k++;
                nums[k] = nums[i];
                i++;
            }
        }
        
        int[] B = Arrays.copyOf(nums, k+1);
        
        return B.length;
    }
    
}