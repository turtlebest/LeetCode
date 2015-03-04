public class RotateArray {
    public void rotate(int[] nums, int k) {
        k %= nums.length;//make sure k>nums.length
        rev(nums, 0, (nums.length-1));
        rev(nums, 0, k-1);
        rev(nums, k, (nums.length-1));
    }
    
    public void rev(int[] arr, int start, int end){
        while(start<=end) {
            int Temp = arr[start];
            arr[start] = arr[end];
            arr[end] = Temp;
            start++;
            end--;
        }
        
    }
}