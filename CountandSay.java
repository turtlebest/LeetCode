public class Solution {
    public String countAndSay(int n) {
        String result = "1";
        
        for (int i = 2; i <= n; i++) {
            StringBuilder temp = new StringBuilder();
            char pre = result.charAt(0);
            int count = 1;
            for (int j = 1; j < result.length(); j++) {
                if(result.charAt(j) == pre) {
                    count++;
                } else {
                    temp.append(count);
                    temp.append(pre);
                    count = 1;
                }
                pre = result.charAt(j);
            }
            
            temp.append(count);
            temp.append(result.charAt(result.length()-1));
            result = temp.toString();
        }
        return result;
    }
    
}