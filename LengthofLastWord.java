public class Solution {
    public int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        boolean haveC = false;
        int size = 0;
        
        for (int i = (s.length()-1); i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (size != 0) {
                    return size;
                }
            } else {
                size++;
            }
        }
        
        return size;
    }
    
}