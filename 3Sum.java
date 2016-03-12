public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        Arrays.sort(nums);
        
        if (nums.length <=2) {
            return result;
        }
        
        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];
            int value = 0 - cur;
            
            if (value < 0) {
                break;
            }
            
            for (int j = i+1; j < nums.length; j++) {
                if (map.containsKey(nums[j])) {
                    ArrayList<Integer> temp = new ArrayList<Integer>();
                    temp.add(cur);
                    temp.add(nums[map.get(nums[j])]);
                    temp.add(nums[j]);
                    result.add(temp);
                    
                    while (j+1 < nums.length && nums[j] == nums[j+1] ) {
                        j += 1;
                    }
                } else {
                    map.put(value - nums[j], j);
                }
            }
            
            while (i+1 < nums.length && nums[i] == nums[i+1] ) {
                i += 1;
            }
            map = new HashMap<Integer, Integer>();
        }
        
        return result;
    }
    
}