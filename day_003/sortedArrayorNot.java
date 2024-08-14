import java.util.Arrays;

class Solution{
    public boolean isSorted(int[] arr){
        int asc = 0;
        boolean sorted = true; 

        for (int i = 0; i < arr.length-1; i++) {
            if (asc == 0){
                // for checking the type of sort: asc or desc and 
                // also to be by default be set as sorted till the point from start if all same elements are encountered
                if (arr[i] > arr[i+1]) asc = 1;
                else if (arr[i] < arr[i+1]) asc = -1;
            }
            else if (asc==-1){
                // for descending order
                if (arr[i] <= arr[i+1]) continue;
                else {
                    sorted = false;
                    break;
                }
            }
            else{
                // for ascending order
                if (arr[i] >= arr[i+1]) continue;
                else {
                    sorted = false;
                    break;
                } 
            }
        }
        return sorted;
    }
}

public class sortedArrayorNot {
    // to be changed
    public static void main(String[] args) {
        Solution c1 = new Solution();

        int[][] cases = {
            {2,4,3},
            {5,6,4},
            {9,9,9,9,9,9,9},
            {9,9,9,9},
            {0},
            {2,3},
            {1,2,3,4,5},
            {5,4,6,7,8},
            {9,8,7,6,5}
        };

        for (int i = 0; i < cases.length; i++) {
            boolean res = c1.isSorted(cases[i]);
            System.out.println(Arrays.toString(cases[i])+" is sorted? "+res);
        }
    }
}
