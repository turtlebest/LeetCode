public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        
        StringBuilder prefix = new StringBuilder();
        String s1 = new String();
        String s2 = new String();
        
        for (int i = 0; i < strs.length; i++) {
            for (int j = (i+1); j < strs.length; j++) {
                int k = 0;
                StringBuilder temp = new StringBuilder();
                
                s1 = strs[i];
                s2 = strs[j];
                
                while (k < s1.length() && k < s2.length()) {
                    if (s1.charAt(k) == s2.charAt(k)) {
                        temp.append(s1.charAt(k));
                    } else {
                        break;
                    }
                    k++;
                }
                
                if (k == 0) {
                    return "";
                }
                
                if (prefix.length() > temp.length() || prefix.length() == 0) {
                    prefix = temp;
                }
                
            }
            
        }
        
        return prefix.toString();
        
    }
}