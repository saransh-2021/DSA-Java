import java.util.*;

class Solution{
    public int[] addTwoNumbers(int[] a, int[] b){
        int maxLength = Math.max(a.length, b.length);
        int[] res = new int[maxLength+1];
        int carry = 0 ;

        for (int i = 0; i < maxLength; i++) {
            int p = i < a.length ? a[i] : 0 ;
            int q = i < b.length ? b[i] : 0 ;

            int sum = p + q + carry;
            res[i] = sum % 10 ;
            carry = sum / 10 ;  
        }

        if (carry != 0) res[maxLength] = carry ;
        else res = Arrays.copyOfRange(res, 0, maxLength);

        return res;
    }
}

public class addTwoNumbersArr {
    public static void main(String[] args) {
        Solution c1 = new Solution();

        int[][] cases = {
            {2,4,3},
            {5,6,4},
            {0},
            {0},
            {9,9,9,9,9,9,9},
            {9,9,9,9}
        };

        for (int i = 0; i < cases.length; i+=2) {
            int[] res = c1.addTwoNumbers(cases[i], cases[i+1]);
            System.out.println(Arrays.toString(res));
        }
    }
}