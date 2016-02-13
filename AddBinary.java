public class Solution {
    public String addBinary(String a, String b) {
        if (a == null || b == null) {
            return "0";
        }
        
        int m = a.length();
        int n = b.length();
        
        String add = new String();
        int cache = 0;
        
        while(m > 0 && n > 0) {
            int temp = (a.charAt((m-1))-'0')+(b.charAt((n-1))-'0') + cache;
            
            if (temp == 1) {
                cache = 0;
                add = '1' + add;
            } else if (temp == 0) {
                cache = 0;
                add = '0' + add;
            } else if (temp == 2){
                cache = 1;
                add = '0' + add;
            } else {
                cache = 1;
                add = '1' + add;
            }
            m--;
            n--;
        }
        
        while (m > 0) {
            int temp = (a.charAt((m-1))-'0') + cache;
            
            if (temp == 1) {
                cache = 0;
                add = '1' + add;
            } else if (temp == 0) {
                cache = 0;
                add = '0' + add;
            } else if (temp == 2){
                cache = 1;
                add = '0' + add;
            }
            
            m--;
        }
        
        while (n > 0) {
            int temp = (b.charAt(n-1)-'0') + cache;
            
            if (temp == 1) {
                cache = 0;
                add = '1' + add;
            } else if (temp == 0) {
                cache = 0;
                add = '0' + add;
            } else if (temp == 2){
                cache = 1;
                add = '0' + add;
            }
            n--;
        }
        
        if (cache == 1) {
            add = '1' + add;
        }
        
        return add;
    }
    
    /*    int addString() {
     
     }*/
    
}