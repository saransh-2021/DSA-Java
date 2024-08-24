import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        if ( s.length() % 2 == 1) return false;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == '(' || c == '{' || c == '[') 
                stack.push(c);
            
            else{
                if (stack.empty()) return false;

                char top = stack.peek();
                if ((c == ')' && top == '(') ||  (c == ']' && top == '[') || (c == '}' && top == '{'))
                    stack.pop();
                else
                    return false;
            }
        } 

        return stack.empty();
    }
}

public class ValidParentheses {
    public static void main(String[] args) {
        Solution c1 = new Solution();

        String[] cases = {
            "()",
            "()[]{}",
            "(]",
            "([])",
            "("
        };

        boolean[] output = {
            true,
            true,
            false,
            true,
            false
        };
        
        for (int i = 0; i < cases.length; i++) {
            boolean res = c1.isValid(cases[i]);
            System.out.println("Expected: " + output[i] + ", Output: " + res);
            System.out.println("Correct Answer: " + (output[i]==res));
            System.out.println();
        }
    }
}
