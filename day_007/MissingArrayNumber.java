class Solution {
    /*
    Time Complexity: 𝑂(𝑁) 
    Space Complexity: 𝑂(1)
    */

    public int missingNumber(int[] arr, int N) {
        // in case the array is not sorted
        int expectedSum = (N * (N + 1)) / 2; 
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        // The missing number is the difference between expected and actual sum
        return expectedSum - actualSum;
    }
}


public class MissingArrayNumber {
    public static void main(String[] args) {
        Solution c1 = new Solution();

        int[][] cases = {
            {1,2,4,5},
            {1,3},
            {1,2,3},
            {1,2,3,5,6,7,8},
            {1,2,3,4}
        };

        int[] n = {
            5,3,4,8,4
        };

        int[] output = {
            3,2,4,4,0
        };

        for (int i = 0; i < cases.length; i++) {
            int res = c1.missingNumber(cases[i], n[i]);
            System.out.println("Expected: " + output[i] + ", Output: " + res);
            System.out.println("Correct Answer: " + (output[i]==res));
            System.out.println();
        }
    }
}
