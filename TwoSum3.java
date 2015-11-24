import java.util.HashMap;
import java.util.Map;

public class TwoSum3 {
    HashMap<Integer,Integer> data = new HashMap<Integer,Integer>();
    public void add(int n) {
        if (data.containsKey(n)){
            data.put(n, data.get(n)+1);
        } else {
            data.put(n,1);
        }
    }
    
    public boolean find(int x){
        for(Integer key : data.keySet()) {
            if (x-key == key) {
                if (data.get(key) >= 2) {
                    return true;
                }
            } else if (data.containsKey(x-key)){
                return true;
            }
        }
        return false;
    }
    
}

public class Sum {
    HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
    
    public boolean find (int k) {
        int mvalue = 0;
        for (Integer value:h.keySet()) {
            if (k - value > 0) {
                mvalue = k-value;
                if (mvalue == ) {
                    
                    
                }
            }
        }
    }
    
}