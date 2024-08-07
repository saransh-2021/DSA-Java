import java.util.*;

class Solution1{
    // fails in cases where there are duplicate cases

    // Time Complexity: O(NlogN), For sorting the array
    // Space Complexity: O(1)

    int[] getSecondOrderElements(int n, int []a) {
        if (n < 2) {
            return new int[] {-1, -1};
        }
        Arrays.sort(a);
        return new int[] {a[1], a[n-2]};
    }
}

class Solution2{
    int[] getSecondOrderElements(int n, int []a) {
        if (n < 2) {
            return new int[] {-1, -1};
        }
        
        SortedMap<Integer, Integer> treemap = new TreeMap<>();
        for (int i = 0; i < a.length; i++) {
            treemap.putIfAbsent(a[i], i);
        }
        
        // extract the second smallest and second largest
        Set<Integer> sol = treemap.keySet();
        Integer[] solArr = sol.toArray(new Integer[sol.size()]);
        return new int[] {solArr[1],solArr[sol.size()-2]};
    }
}

class Solution{
    // Time Complexity: O(N)
    // Space Complexity: O(1)

    int[] getSecondOrderElements(int n, int[] a){
        if (n < 2) {
            return new int[] {-1, -1};
        }

        int min = Integer.MAX_VALUE, secMin = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE, secMax = Integer.MIN_VALUE;

        for (int i : a) {
            if (max < i){
                secMax = max;
                max = i;
            }
            else if ((i > secMax) && (i != max)) secMax = i;


            if (min > i){
                secMin = min;
                min = i;
            }
            else if ((i< secMin) && (i != min)) secMin = i;
        }

        return new int[] {secMin,secMax};
    }
}


public class secondSmallest_secondLargest {
    public static void main(String[] args) {
        Solution c1 = new Solution();

        int[][] cases = {
            {1,2,4,7,7,5},
            {1},
            {3,4,5,2},
            {4,5,3,6,7}
        };

        for ( int i = 0 ; i < cases.length ; i++){
            System.out.println(Arrays.toString(c1.getSecondOrderElements(cases[i].length, cases[i])));
        }
    }    
}