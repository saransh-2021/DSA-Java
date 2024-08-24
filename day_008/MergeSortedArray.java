import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] tempArr = new int[m+n];
        int i = 0, j = 0;
        
        for (int index = 0 ; index < nums1.length; index++){
            int num1 = i < m ? nums1[i] : Integer.MAX_VALUE;
            int num2 = j < n ? nums2[j] : Integer.MAX_VALUE;

            if (num1 <=num2) {
                tempArr[index] = num1;
                i++;
            }
            else {
                tempArr[index] = num2;
                j++;
            }
        }
        System.arraycopy(tempArr, 0, nums1, 0, m+n);
    }
}

class Solution2 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m - 1;
        int index2 = n - 1;
        int megeIndex = m + n - 1;
        
        while (index1 >= 0 && index2 >= 0 ) {
            if (nums1[index1] > nums2[index2]) nums1[megeIndex--] = nums1[index1--];
            else nums1[megeIndex--] = nums2[index2--];
        }
        
        while (index2>=0) {
            nums1[megeIndex--] = nums2[index2--];
        }
    }
}

class Solution3{
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int i = 0; i < n; i++) {
            nums1[m++] = nums2[i];
        }

        Arrays.sort(nums1);
    }
}

public class MergeSortedArray {
    public static void main(String[] args) {
        Solution3 c1 = new Solution3();

        int[][] cases = {
            {1,2,3,0,0,0},
            {2,5,6},
            {1},
            {},
            {0},
            {1}
        };

        int[] lengths = {
            3,3,
            1,0,
            0,1
        };

        int[][] output = {
            {1,2,2,3,5,6},
            {1},
            {1}
        };

        int j = 0;
        for (int i = 0; i < cases.length-1; i+=2) {
            int[] num1 = cases[i];
            int[] num2 = cases[i+1];
            c1.merge(num1, lengths[i], num2, lengths[i+1]);
            System.out.println("Expected: " + Arrays.toString(output[j]) + ", Output: " + Arrays.toString(num1));
            System.out.println("Correct Answer: " + (Arrays.equals(num1, output[j])));
            j++;
            System.out.println();
        }
    }
}
