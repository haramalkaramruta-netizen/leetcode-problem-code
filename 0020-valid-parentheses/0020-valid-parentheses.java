class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            // If opening bracket, push to stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                // If closing bracket, check if stack is empty
                if (stack.isEmpty()) {
                    return false;
                }
                
                char top = stack.pop();
                // Check for matching pairs
                if (c == ')' && top != '(') return false;
                if (c == '}' && top != '{') return false;
                if (c == ']' && top != '[') return false;
            }
        }
        
        // If stack is empty, all open brackets were closed
        return stack.isEmpty();
    }
}
