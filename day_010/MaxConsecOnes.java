class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0, count = 0;
        for (int num : nums) {
            if (num != 0) count++;
            else count = 0;

            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
}

public class MaxConsecOnes {
    public static void main(String[] args) {
        Solution c1 = new Solution();

        int[][] cases = {
            {1, 1, 0, 1, 1, 1},
            {1, 0, 1, 1, 0, 1} ,
        };

        int[] output = {
            3,
            2
        };

        for (int i = 0; i < cases.length; i++) {
            int res = c1.findMaxConsecutiveOnes(cases[i]);
            System.out.println("Expected: " + output[i] + ", Output: " + res);
            System.out.println("Correct Answer: " +(output[i]== res)) ;
            System.out.println();
        }
    }
}
