public class Solution {
    public int majorityElement(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        int temp = 0;
        int mnum = nums.length / 2;
        
        
        for (int i = 0; i < nums.length; i++) {
            temp = 1;
            if(map.containsKey(nums[i])) {
                temp = map.get(nums[i]);
                temp++;
                if (temp > mnum) {
                    return nums[i];
                }
                map.put(nums[i], temp);
            }
            map.put(nums[i], temp);
        }
        
        return 0;
    }
}

/*
 public int majorityElement(int[] num) {
	if (num.length == 1) {
 return num[0];
	}
 
	Arrays.sort(num);
	return num[num.length / 2];
 }
 */