public class Solution {
    public boolean isHappy(int n) {
        if (n == 0) {
            return false;
        }
        
        HashSet<Integer> set = new HashSet<Integer>();
        
        while (n != 1 && !set.contains(n)) {
            int remain = n;
            
            set.add(n);
            n = 0;
            
            while (remain != 0) {
                int temp = remain % 10;
                n += temp*temp;
                remain = remain / 10;
            }
            
        }
        
        return n == 1;
    }
    
}