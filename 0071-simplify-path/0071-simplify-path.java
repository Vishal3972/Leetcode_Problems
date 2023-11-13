class Solution {
        public static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        StringBuilder current = new StringBuilder();

        for (char c : path.toCharArray()) {
            if (c == '/') {
                handleComponent(stack, current.toString());
                current.setLength(0); 
            } else {
                current.append(c);
            }
        }
        handleComponent(stack, current.toString());

        StringBuilder result = new StringBuilder("/");
        for (String component:stack) {
            result.append(component).append("/");
        }

        if (result.length() > 1) {
            result.setLength(result.length() - 1);
        }

        return result.toString();
    }

    private static void handleComponent(Stack<String> stack, String component) {
        if (component.equals("..")) {
            if (!stack.isEmpty()) {
                stack.pop();
            }
        } else if (!component.isEmpty() && !component.equals(".")) {
            stack.push(component);
        }
    }
}