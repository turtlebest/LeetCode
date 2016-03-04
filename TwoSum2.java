
//Input: numbers={2, 7, 11, 15}, target=9 Output: index1=1, index2=2
import java.util.HashMap;

public static int[] twoSum(int[] nums, int target) {
    int[] result = new int[2];
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

    for (int i = 0; i < nums.length; i++) {
        int temp = target - nums[i];
        if (!map.containsKey(temp)) {
            map.add(nums[i], i);
        } else {
            result[0] = map.get(temp);
            result[1] = i;
        }
    }

    return result;
}

public static void main(String [] args)
{
	int[] array = new int[]{1,2,3,4,5,7,8,9};
	// Deliver the robot to the origin (1,1),
	// facing East, with no beepers.
	int[] r = twoSum(array, 17);

	System.out.println(r[0]);
	System.out.println(r[1]);
}
