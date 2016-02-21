public class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        HashMap<String,String> map = new HashMap<String, String>();
        
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(Character.toString(s.charAt(i)))) {
                String temp = Character.toString(t.charAt(i));
                String comp = map.get(Character.toString(s.charAt(i)));
                if (!comp.equals(temp)) {
                    return false;
                }
            } else if (map.containsValue(Character.toString(t.charAt(i)))) {
                return false;
            } else {
                map.put(Character.toString(s.charAt(i)), Character.toString(t.charAt(i)));
            }
        }
        
        return true;
    }
    
}
//O(n)