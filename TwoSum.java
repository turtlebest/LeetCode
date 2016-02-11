public class Solution {
    public int[] twoSum(int[] nums, int target) {
        //HashMap 是 Map的children;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] index = new int[2];
        
        for (int i = 0; i<nums.length; i++){
            if(map.containsKey(nums[i])) {
                index[0] = map.get(nums[i])+1;
                index[1] = i+1;
            } else {
                map.put(target-nums[i],i);
            }
        }
        return index;
    }
    
}