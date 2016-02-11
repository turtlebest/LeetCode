public class Solution {
    public int myAtoi(String str) {
        if (str == null || str.length() < 1) {
            return 0;
        }
        
        double sum = 0;
        boolean positive = true;
        int i = 0;
        
        str = str.trim();
        
        if (str.charAt(0) == '-') {
            positive = false;
            i++;
        } else if (str.charAt(0) == '+') {
            i++;
        }
        
        while (str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            //注意要扣掉'0'
            sum = sum*10 + (str.charAt(i) - '0');
            i++;
        }
        
        if (!positive) {
            sum = -sum;
        }
        return (int)sum;
    }
    
}