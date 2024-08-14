import java.util.Map;

class Solution{
    /*
    Time Complexity : O(N)
    Space Complexity : O(1)
    took 6ms time on leetcode
    */
    public int convertRomantoInteger(String roman){
        int ans = 0;

        Map<Character, Integer> map = Map.ofEntries(
            Map.entry('I', 1),
            Map.entry('V', 5),
            Map.entry('X', 10),
            Map.entry('L', 50),
            Map.entry('C', 100),
            Map.entry('D', 500),
            Map.entry('M', 1000)
        );

        for (int i = 0; i < roman.length()-1; i++) {
            int curr = map.get(roman.charAt(i)) ;
            int next = map.get(roman.charAt(i+1));
            if ( curr < next ) ans -= curr;
            else ans += curr; 
        }

        ans += map.get(roman.charAt(roman.length()-1));
        return ans;
    }
}

class Solution2{
    /*
    Time Complexity : O(N)
    Space Complexity : O(1)
    took 2ms time on leetcode
    */
    public int convertRomantoInteger(String roman){
        int ans = 0;
        int prev = 0;
        
        for (int i = roman.length() - 1; i >= 0 ; i--) {
            int curr = 0;
            switch (roman.charAt(i)) {
                case 'I' -> curr = 1;
                case 'V' -> curr = 5;
                case 'X' -> curr = 10;
                case 'L' -> curr = 50;
                case 'C' -> curr = 100;
                case 'D' -> curr = 500;
                default -> curr = 1000;
            }
            
            if ( curr < prev ) ans -= curr;
            else ans += curr; 
            prev = curr ;
        }
        return ans;
    }
}

class Solution3{
    /*
    Time Complexity : O(N)
    Space Complexity : O(1)
    took 2ms time on leetcode
    */
    public int convertRomantoInteger(String roman){
        int ans = 0;
        int[] values = new int[26];
        values['I' - 'A'] = 1;
        values['V' - 'A'] = 5;
        values['X' - 'A'] = 10;
        values['L' - 'A'] = 50;
        values['C' - 'A'] = 100;
        values['D' - 'A'] = 500;
        values['M' - 'A'] = 1000;
            
        for (int i = 0; i < roman.length() - 1; i++) {
            int curr = values[roman.charAt(i) - 'A'];
            int next = values[roman.charAt(i + 1) - 'A'];
            if (curr < next) ans -= curr;
            else ans += curr;
        }

        ans += values[roman.charAt(roman.length() - 1) - 'A'];
        return ans;
    }
}

public class romantoInteger {
     public static void main(String[] args) {
        Solution2 c1 = new Solution2();

        String[] cases = {
            "III",
            "LVIII",
            "MCMXCIV",
        };

        int[] output = {
            3,
            58,
            1994
        };

        for (int i = 0; i < cases.length; i++) {
            int res = c1.convertRomantoInteger(cases[i]);
            System.out.println(cases[i]+" is "+res+" correct? "+(output[i]==res));
        }
    }
}
