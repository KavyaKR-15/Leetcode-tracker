// Last updated: 9/7/2026, 3:01:29 PM
1class Solution {
2    public boolean judgeSquareSum(int c) {
3        long left = 0;
4        long right = (long) Math.sqrt(c);
5        while (left <= right) {
6            long sum = left * left + right * right;
7
8            if (sum == c) {
9                return true;
10            } 
11            else if (sum < c) {
12                left++;
13            } 
14            else {
15                right--;
16            }
17        }
18        return false;
19    }
20}