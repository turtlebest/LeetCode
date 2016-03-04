public class Solution {
    public int ladderLength(String beginWord, String endWord, Set<String> wordList) {
        Queue<String> queue = new LinkedList<String>();
        Queue<Integer> dis = new LinkedList<Integer>();
        
        wordList.remove(endWord);
        wordList.remove(beginWord);
        
        if (wordList.size()==0) {
            return 0;
        }
        
        queue.offer(beginWord);
        dis.add(1);
        
        while (!queue.isEmpty()) {
            String curS = queue.poll();
            int d = dis.poll();
            
            if (wordDiff(curS, endWord) == 1) {
                return d+1;
            }
            
            wordList.remove(curS);
            
            for (Iterator<String> it = wordList.iterator(); it.hasNext(); ) {
                String temp = it.next();
                if (wordDiff(curS, temp) == 1) {
                    queue.add(temp);
                    dis.add(d+1);
                }
            }
            
        }
        
        return 0;
    }
    
    public int wordDiff(String a, String b) {
        int diff = 0;
        
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                diff++;
            }
        }
        
        return diff;
  }
}

public class Solution {
    public int ladderLength(String beginWord, String endWord, Set<String> wordList) {
        Queue<String> queue = new LinkedList<String>();
        Queue<Integer> dis = new LinkedList<Integer>();
        
        queue.offer(beginWord);
        dis.add(1);
        
        while (!queue.isEmpty()) {
            String curS = queue.poll();
            int d = dis.poll();
            
            if (curS.equals(endWord)) {
                return d;
            }
            
            for (int i = 0; i < curS.length(); i++) {
                char[] strCharArr = curS.toCharArray();
                for (char c='a'; c<='z'; c++) {
                    strCharArr[i] = c;
                    String temp = new String(strCharArr);
                    if (wordList.contains(temp)) {
                        queue.add(temp);
                        dis.add(d+1);
                        wordList.remove(temp);
                    }
                }
            }
            
        }
        
        return 0;
    }
}