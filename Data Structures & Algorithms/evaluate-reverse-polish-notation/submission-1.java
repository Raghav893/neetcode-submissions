class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();

        int i = 0;

        while (i < tokens.length) {
            String val = tokens[i];

            if (val.equals("+")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a + b);

            } else if (val.equals("*")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a * b);

            } else if (val.equals("-")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a - b);

            } else if (val.equals("/")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a / b);

            } else {
                stack.push(Integer.parseInt(val));
            }

            i++;
        }

        return stack.peek();
    }
}