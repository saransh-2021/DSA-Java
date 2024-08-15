class Solution {
    public int myAtoi(String s) {
        /*
        Time Complexity:O(N)
        Space Complexity:O(1)
        */
        
        long ans = 0;
        boolean numStart = false, isNegative = false;
   
        s = s.trim(); 
        char[] sCharArray = s.toCharArray();
    
        for (char c : sCharArray) {
            if (!numStart) {
                if (c == '-') {
                    // Start parsing number after sign
                    isNegative = true;
                    numStart = true; 
                } 
                else if (c == '+') {
                    // Start parsing number after sign
                    numStart = true; 
                } 
                else if (Character.isDigit(c)) {
                    // Start parsing number
                    numStart = true; 
                    ans = ans * 10 + (c - '0');
                } 
                else 
                    // Return 0 if the first non-space character is not a valid sign or digit
                    return 0; 
            } 
            else if (Character.isDigit(c)) {
                ans = ans * 10 + (c - '0');

                // Handling overflow in case the number becomes greater than the available limit
                if (ans > Integer.MAX_VALUE ) return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            } 
            else {
                // Stop parsing at first non-digit character after the number starts
                break; 
            }
        }
        return isNegative ? -(int)ans : (int)ans;
    }
}
class Solution2 {
    public int myAtoi(String s) {
        /*
        Time Complexity:O(N)
        Space Complexity:O(1)
        */

        long ans = 0;
        int i = 0;
        boolean isNegative  = false;
        
        s = s.trim(); 
        if (s.isEmpty()) return 0;

        // check the sign
        if (s.charAt(0) == '-'){
            isNegative = true;
            i = 1;
        }
        else if (s.charAt(0) == '+') i = 1;

        // int i = 0 is initialised above so no need to worry about that
        for ( ; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                // if the character is a digit add it to the ans
                ans = ans * 10 + (c - '0');

                // Handling overflow in case the number becomes greater than the available integer limit
                if (ans > Integer.MAX_VALUE ) return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            } 
            else {
                // Stop parsing at first non-digit character after the number starts
                break; 
            }
        }
        return isNegative ? -(int)ans : (int)ans;
    }
}

public class StringtoInteger {
    public static void main(String[] args) {
        Solution2 c1 = new Solution2();

        String[] cases = {
            "42",
            "   -042",
            "1337c0d3",
            "0-1",
            "words and 987",
            "4193 with words",
            "-91283472332",
            "21474836460",
            "+1"
        };

        int[] output = {
            42,
            -42,
            1337,
            0,
            0,
            4193,
            -2147483648,
            2147483647,
            1
        };

        for (int i = 0; i < cases.length; i++) {
            int res = c1.myAtoi(cases[i]);
            System.out.println("Expected: " + output[i] + ", Output: " + res);
            System.out.println("Correct Answer: " + (output[i]==res));
            System.out.println();
        }
    }
}
