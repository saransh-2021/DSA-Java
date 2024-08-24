/* Both the solutions are great in a way */

class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        
        int haystackLen = haystack.length();
        int needleLen = needle.length();
        
        if (haystackLen < needleLen) return -1;
        
        for (int i = 0; i <= haystackLen - needleLen; i++) 
        if (haystack.substring(i, i + needleLen).equals(needle)) 
        return i;            
        
        return -1;
    }
}
class Solution2 {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}

public class FirstOccurenceSubstring {
    public static void main(String[] args) {
        Solution2 c1 = new Solution2();

        String[] cases = {
            "sadbutsad",
            "sad",
            "leetcode",
            "leeto",
            "hello",
            "ll",
            "a",
            "a",
            "abc",
            "c"
        };

        int[] output = {
            0,
            -1,
            2,
            0,
            2
        };
        int j = 0;
        for (int i = 0; i < cases.length-1; i+=2) {
            int index = c1.strStr(cases[i], cases[i+1]);
            System.out.println("Expected: " + output[j] + ", Output: " + index);
            System.out.println("Correct Answer: " + (output[j++]==index));
            System.out.println();
        }
    }
}
