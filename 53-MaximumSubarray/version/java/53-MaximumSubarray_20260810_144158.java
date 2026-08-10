// Last updated: 8/10/2026, 2:41:58 PM
1class Solution {
2    public int maxSubArray(int[] nums) {
3        int maxSum = Integer.MIN_VALUE;
4        int currentSum = 0;
5        for (int i = 0; i < nums.length; i++) {
6            currentSum += nums[i];
7            if (currentSum > maxSum) {
8                maxSum = currentSum;
9            }
10            if (currentSum < 0) {
11                currentSum = 0;
12            }
13        }
14        return maxSum;
15    }
16}