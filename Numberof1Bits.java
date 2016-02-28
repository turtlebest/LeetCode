public class Solution {
    //Java unsigned 33個 bits?
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        if (n == 0) {
            return 0;
        }
        
        int count = 0;
        
        for (int i = 1; i < 33; i++) {
            if ((n & 1 << i) != 0) {
                count++;
            }
        }
        
        return count;
    }
    
}