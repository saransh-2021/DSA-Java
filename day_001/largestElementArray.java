import java.util.Arrays;

class Solution1 {
    /*
        Time Complexity: O(N*log(N))

        Space Complexity: O(n)
     */

    public int largestElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length-1];
    }
}

class Solution {
    /*
        Time Complexity: O(N)

        Space Complexity: O(1)
     */

    public int largestElement(int[] nums) {
        int max = nums[0];
        for (int i : nums) {
            if (max < i) max = i;
        }
        return max;
    }
}

public class largestElementArray {
    public static void main(String[] args) {
        Solution c1 = new Solution();

        int[][] cases = {
            {2,5,1,3,0},
            {8,10,5,7,9}
        };

        for ( int i = 0 ; i < cases.length ; i++){
            System.out.println(c1.largestElement(cases[i]));
        }
    }
}

/*
Solution
5
10
*/