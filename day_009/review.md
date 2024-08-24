14 August, 2024

## Problem 1: [Find the Index of the First Occurrence in a String](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/)

Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:
Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.

Example 2:
Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
 

Constraints:
1 <= haystack.length, needle.length <= 104
haystack and needle consist of only lowercase English characters.

[Final Solution](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/submissions/1366494306)


## Problem 2: [Move all Zeros to the end of the array](https://takeuforward.org/data-structure/move-all-zeros-to-the-end-of-the-array/)
[Leetcode Link](https://leetcode.com/problems/move-zeroes/)

Problem Statement: You are given an array of integers, your task is to move all the zeros in the array to the end of the array and move non-negative integers to the front by maintaining their order.

Note that you must do this in-place without making a copy of the array.

Example 1:
Input:
 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1
Output:
 1 ,2 ,3 ,4 ,1 ,0 ,0 ,0
Explanation:
 All the zeros are moved to the end and non-negative integers are moved to front by maintaining order

Example 2:
Input:
 1,2,0,1,0,4,0
Output:
 1,2,1,4,0,0,0
Explanation:
 All the zeros are moved to the end and non-negative integers are moved to front by maintaining order

Example 3:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Example 4:
Input: nums = [0]
Output: [0]
 
Constraints:
1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1

Follow up: Could you minimize the total number of operations done?

[Final Solution](https://leetcode.com/problems/move-zeroes/submissions/1366519517)