public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<Integer>();
        
        for (int i = 0; i < tokens.length; i++) {
            int count = 0;
            
            if (tokens[i].equals("/") || tokens[i].equals("*")  || tokens[i].equals("+")  || tokens[i].equals("-") ) {
                char op = tokens[i].charAt(0);
                int n = 1;
                int[] cal = new int[2];
                
                cal[1] = s.pop();
                cal[0] = s.pop();
                
                count = calculate(cal, op);
                s.push(count);
            } else {
                count = Integer.valueOf(tokens[i]);
                s.push(count);
            }
        }
        
        return s.pop();
    }
    
    public int calculate(int[] number, char op) {
        int result = 0;
        
        if (op == '/') {
            if (number[0] == 0 || number[1] == 0) {
                result = 0;
            } else {
                result = number[0] / number[1];
            }
        } else if (op == '*') {
            result = number[0] * number[1];
        } else if (op == '+') {
            result = number[0] + number[1];
        } else if (op == '-') {
            result = number[0] - number[1];
        }
        
        return result;
    }
}