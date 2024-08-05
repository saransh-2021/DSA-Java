import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++){
            for (int j = i+1; j < nums.length; j++){
                if (i == j) continue;
                if (nums[i] + nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }
}

class Solution2 {
    public int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if ((map.containsKey(complement)) && (map.get(complement) != i)) {
                return new int[] {map.get(complement), i};
            }
        }
        return new int[] {-1,-1};
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) return new int[] {map.get(complement), i};
            map.put(nums[i], i);
        }
        return new int[] {-1,-1};
    }
}

public class twoSum {
    public static void main(String[] args) {
        Solution c1 = new Solution();

        int[][] cases = {
            {2,7,11,15},
            {3,2,4},
            {3,3},
            {0,4,3,0},
            {2,5,5,11}
        };
        int[] target = {9,6,6,0,10};

        for ( int i = 0 ; i < cases.length ; i++){
            System.out.println(Arrays.toString(c1.twoSum(cases[i], target[i])));
        }
    }
}

/*
Solution
[0, 1]
[1, 2]
[0, 1]
[0, 3]
[1, 2]
 */