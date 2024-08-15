import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1){
            return strs[0];
        }

        String commonPrefix = "";

        int minlen = Integer.MAX_VALUE;
        for (String string : strs) {
            if (minlen > string.length()) minlen = string.length();
        }

        if (minlen == 0) return "";

        for (int i = 0; i < minlen; i++) {
            char currentChar = strs[0].charAt(i) ;

            for (String string : strs) {
                if (currentChar != string.charAt(i)) return commonPrefix;
            }

            commonPrefix += currentChar;
        }
        return commonPrefix;
    }
}

class Solution2{
    public String longestCommonPrefix(String[] strs){
        Arrays.sort(strs);
        int index = 0;

        String first = strs[0];
        String last = strs[strs.length-1];
        
        while (index < first.length() && index < last.length() ) {
            if (first.charAt(index) == last.charAt(index)) index++;
            else break;
        }
        return first.substring(0, index);
    }
}

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Solution2 c1 = new Solution2();

        String[][] cases = {
            {"flower","flow","flight"},
            {"dog","racecar","car"}
        };

        String[] output = {
            "fl",
            ""
        };

        for (int i = 0; i < cases.length; i++) {
            String res = c1.longestCommonPrefix(cases[i]);
            System.out.println("Expected: " + output[i] + ", Output: " + res);
            System.out.println("Correct Answer: " + (output[i].equals(res)));
            System.out.println();
        }
    }
}
