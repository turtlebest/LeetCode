public class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack==null || needle==null)
            return 0;
        
        int nlength = needle.length();
        int hlength = haystack.length();
        
        if (nlength == 0) {
            return 0;
        }
        
        
        for (int i = 0; i < hlength; i++) {
            if ((hlength - i) >= nlength) {
                String sub = haystack.substring(i, nlength+i);
                if (sub.equals(needle)) {
                    return i;
                }
            }
            
        }
        
        return -1;
    }
    
}