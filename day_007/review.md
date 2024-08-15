12 August, 2024

## Problem 1: [Longest Common Prefix](https://leetcode.com/problems/longest-common-prefix/description/)

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

Constraints:
1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.

[Final Solution](https://leetcode.com/problems/longest-common-prefix/submissions/1356916655)


## Problem 2: [Find the missing number in an array](https://takeuforward.org/arrays/find-the-missing-number-in-an-array/)

Problem Statement: Given an integer N and an array of size N-1 containing N-1 numbers between 1 to N. Find the number(between 1 to N), that is not present in the given array.

Example 1:
Input Format:
 N = 5, array[] = {1,2,4,5}
Result:
 3
Explanation: 
In the given array, number 3 is missing. So, 3 is the answer.

Example 2:
Input Format:
 N = 3, array[] = {1,3}
Result:
 2
Explanation: 
In the given array, number 2 is missing. So, 2 is the answer.

Example 3:
 Input Format: :
4  
1 2 3
 Output :
4
Explanation:
4 is the missing value in the range 1 to 4.

Example 4:
Input:
8
1 2 3 5 6 7 8
 Output:
4
Explanation :
4 is the missing value in the range 1 to 8.


Expected time complexity: O(n)


Constraints:
1 <= 'n' <= 10^6 
1 <= 'a'[i] <= 'n'
Time Limit: 1 sec