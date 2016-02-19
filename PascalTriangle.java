public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> Plist = new ArrayList<List<Integer>>();
        
        if (numRows == 0) {
            return Plist;
        }
        
        List<Integer> prelist = new ArrayList<Integer>();
        
        for(int i = 0; i < numRows; i++) {
            List<Integer> templist = new ArrayList<Integer>();
            for (int j = 0; j <= i; j++) {
                int add = 0;
                if (j == 0 || j == i) {
                    templist.add(1);
                } else {
                    add = prelist.get(j) + prelist.get(j-1);
                    templist.add(add);
                }
                
            }
            Plist.add(templist);
            prelist = templist;
        }
        
        return Plist;
    }
    
}