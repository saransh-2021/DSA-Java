class Solution{
    public int searchElement(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}

public class simpleLinearSearch {
    public static void main(String[] args) {
        Solution c1 = new Solution();

        int[][] cases = {
            {1,2,3,4,5},
            {5,4,3,2,1}
        };

        int[] target = {
            3,
            5
        };

        for (int i = 0; i < cases.length; i++) {
            int res = c1.searchElement(cases[i], target[i]);
            System.out.println(res);
        }
    }
}
