public class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() == 1) {
            return s;
        }
        
        int step = (2*numRows -2);
        StringBuilder covertS = new StringBuilder();
        
        for (int i = 0; i < numRows; i++) {
            //first and last line
            if (i == 0 || (i+1) == numRows) {
                for (int k = i; k < s.length(); k += step) {
                    covertS.append(s.charAt(k));
                }
            } else {
                int j = i;
                int step1 = 2*(numRows - 1 - i);
                int step2 = step - step1;
                boolean flag = true;
                
                while (j < s.length()) {
                    covertS.append(s.charAt(j));
                    if (flag) {
                        j += step1;
                    } else {
                        j += step2;
                    }
                    flag = !flag;
                }
            }
        }
        
        return covertS.toString();
    }
    
}