import java.util.Arrays;

class Solution{
    /*
    Time Complexity: O(n)
    Space Complexity: O(n) 
    */
    public int[] leftRotateArrayOne(int[] arr, int n){
        int[] ans = new int[n];
        for (int i = 1; i < n; i++) {
            ans[i-1] = arr[i];
        }
        ans[n-1] = arr[0];

        return ans;
    }
}

class Solution2{
    /*
    Time Complexity: O(n)
    Space Complexity: O(1) 
    */
    public int[] leftRotateArrayOne(int[] arr, int n){
        int temp = arr[0];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i+1];
        }
        arr[n-1] = temp;
        return arr;
    }
}

public class leftRotateOne {
    public static void main(String[] args) {
        Solution2 c1 = new Solution2();

        int[][] cases = {
            {1,2,3,4,5},
            {3}
        };

        int[][] target = {
            {2,3,4,5,1},
            {3}
        };

        for (int i = 0; i < cases.length; i++) {
            int[] res = c1.leftRotateArrayOne(cases[i], cases[i].length);
            System.out.println(Arrays.toString(res));
            System.err.println("Solution Correct? "+ (Arrays.equals(res, target[i])));
        }
    }
}
