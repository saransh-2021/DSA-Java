import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

class Solution {
    /*
    Time Complexity: O(N)
    Space Complexity: O(N)
    Faster than the second solution
    */
    public int removeDuplicates(int[] nums) {
        int i = 0; 

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                nums[++i] = nums[j];
            }
        }
        return i+1 ;
    }
}

class Solution2{
    /*
    Time Complexity: O(N)
    Space Complexity: O(N)
    */
    public int removeDuplicates(int[] nums){
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : nums)  set.add(num);
        Arrays.fill(nums, '_');
        int index = 0;
        for (int unique : set) nums[index++] = unique;
        return index;
    }
}

public class RemoveDuplicatesSArray {
    public static void main(String[] args) {
        Solution c1 = new Solution();

        int[][] cases = {
            {1, 1, 2},
            {0, 0, 1, 1, 1, 2, 2, 3, 3, 4}, 
            {1, 1, 2, 2, 2, 3, 3},
            {1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 4},
            {1, 2, 2, 3, 3, 3, 4, 4, 5, 5},
            {1, 1, 2, 3, 3, 4, 5, 5, 5},
            {-3,-1,0,0,0,3,3}
        };
        
        int[][] expectedNums = {
            {1, 2},
            {0, 1, 2, 3, 4},
            {1, 2, 3},
            {1, 2, 3, 4},
            {1, 2, 3, 4, 5},
            {1, 2, 3, 4, 5},
            {-3,-1,0,3}
        };

        for (int i = 0; i < cases.length; i++) {
            int[] num = cases[i];
            int k = c1.removeDuplicates(num);
            assert k == expectedNums[i].length : "Case "+(i+1)+" Failed";
            for (int j = 0; j < k; j++) {
                assert num[j] == expectedNums[i][j] : "Case "+(i+1)+" Failed";
                }
            System.out.println("Case "+(i+1)+" Success");
            System.out.println();
        }
    }
}