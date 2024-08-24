import java.util.Arrays;

class Solution {
    public void moveZeroes(int[] nums) {
        int nonZeroIndex = 0;
        
        for (int num : nums) 
            if (num!=0)
                nums[nonZeroIndex++] = num;
        
        while (nonZeroIndex < nums.length) 
            nums[nonZeroIndex++] = 0;
    }
}

public class MoveZeroesEnd {
    public static void main(String[] args) {
        Solution c1 = new Solution();

        int[][] cases = {
            {1, 0, 2, 3, 0, 4, 0, 1},
            {1, 2, 0, 1, 0, 4, 0},
            {0, 1, 0, 3, 12},
            {0}
        };

        int[][] output = {
            {1, 2, 3, 4, 1, 0, 0, 0},
            {1, 2, 1, 4, 0, 0, 0},
            {1, 3, 12, 0, 0},
            {0}
        };

        for (int i = 0; i < cases.length; i++) {
            int[] res = cases[i];
            c1.moveZeroes(res);
            System.out.println("Expected: " + Arrays.toString(output[i]) + ", Output: " + Arrays.toString(res));
            System.out.println("Correct Answer: " +(Arrays.equals(output[i], res)) );
            System.out.println();
        }
    }
}
