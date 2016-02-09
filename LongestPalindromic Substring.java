public class Solution {
    int testTwoside(String s, int low, int up){
        int max = 0;
        
        if (low == up){
            low--;
            up++;
            max = 1;
        }
        
        while (low >=0 && up < s.length() && s.charAt(low) == s.charAt(up)) {
            max += 2;
            low--;
            up++;
        }
        
        return max;
    }
    
    public String longestPalindrome(String s) {
        int n = s.length();
        int substartPoint = 0;
        int maxLength = 1;
        int temp = 0;
        
        
        for (int i = 0; i < n; i++){
            temp = testTwoside(s, i, i);
            if (temp > maxLength) {
                substartPoint = i- temp / 2;
                //use babcbad as example
                maxLength = temp;
            }
        }
        
        // abba is also a palindromic substring
        for (int i = 1; i < n; i++){
            temp = testTwoside(s, i-1, i);
            if (temp > maxLength) {
                substartPoint = i - temp / 2;
                maxLength = temp;
            }
        }
        
        return s.substring(substartPoint, substartPoint+maxLength);
        
    }
    
}