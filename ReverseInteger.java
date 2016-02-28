public class Solution {
    public int reverse(int x) {
        boolean neg = false;
        
        if (x < 0) {
            neg = true;
            x = 0 - x;
        }
        
        int result = 0;
        
        while (x != 0) {
            int temp = x % 10;
            int oldresult = result;
            x /= 10;
            result = result*10 + temp;
            if((result - temp)/10 != oldresult)
                return 0;
        }
        
        if (neg) {
            result = 0 - result;
        }
        
        return result;
    }
}