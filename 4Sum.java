public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        HashSet<ArrayList<Integer>> set = new HashSet<ArrayList<Integer>>();
        
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length; i++) {
            //3 sum
            for (int j = i+1; j < nums.length; j++) {
                int l = nums.length-1;
                int k = j+1;
                //2 sum
                
                while (k < l) {
                    int sum = nums[i] + nums[j] + nums[k] + nums[l];
                    
                    if (sum > target) {
                        l--;
                    } else if (sum < target) {
                        k++;
                    } else if (sum == target) {
                        ArrayList<Integer> temp = new ArrayList<Integer>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add(nums[l]);
                        
                        if (!set.contains(temp)) {
                            set.add(temp);
                            result.add(temp);
                        }
                        
                        k++;
                        l--;
                    }
                    
                }
            }
            
        }
        
        return result;
        
    }
}