class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            int result = 0;
            String s = tokens[i];
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                if (stack.size() > 1) {
                    int x = stack.pop();
                    int y = stack.pop();
                    if (s.equals("+")) {
                        result = y + x;
                    } else if (s.equals("-")) {
                        result = y - x;
                    } else if (s.equals("*")) {
                        result = y * x;
                    }else if (s.equals("/")) {
                        result = y / x;
                    }
                stack.push(result);
                }
            } else {
                int n = Integer.parseInt(s);
                stack.push(n);
            }
        }
        return stack.pop();
    }
}