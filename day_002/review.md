## Problem 1: [Find Second Smallest and Second Largest Element in an array](https://takeuforward.org/data-structure/find-second-smallest-and-second-largest-element-in-an-array/)

Problem Statement: Given an array, find the second smallest and second largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.

Example 1:
Input:
 [1,2,4,7,7,5]
Output:
 Second Smallest : 2
	Second Largest : 5
Explanation:
 The elements are as follows 1,2,3,5,7,7 and hence second largest of these is 5 and second smallest is 2

Example 2:
Input:
 
Output:
 Second Smallest : -1
	Second Largest : -1
Explanation:
 Since there is only one element in the array, it is the largest and smallest element present in the array. There is no second largest or second smallest element present.

Example 3 :
Input:
[3,4,5,2]
Output :
4 3
Explanation:
The second largest element after 5 is 4 only, and the second smallest element after 2 is 3.

Example :
Input :
[4,5,3,6,7]
Output:
6 4


Expected Time Complexity: O(n), Where ‘n’ is the size of an input array ‘a’.

Constraints:
2 ≤ 'n' ≤ 10^5
0 ≤ 'a'[i] ≤ 10^9




## Problem 2: [Add Two Numbers](https://leetcode.com/problems/add-two-numbers/)

You are given two non-empty Arrays representing two non-negative integers. The digits are stored in reverse order, and each of their indexed contains a single digit. Add the two numbers and return the sum as an Array.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example 1:

Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.

Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]

Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]

Constraints:

- The number of indexes in each array is in the range [1, 100].
- 0 <= digit.val <= 9

 [My Final Solution](https://leetcode.com/submissions/detail/1345760656/)