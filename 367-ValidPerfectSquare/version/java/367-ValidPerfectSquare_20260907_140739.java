// Last updated: 9/7/2026, 2:07:39 PM
1class Solution {
2    public boolean isPerfectSquare(int num) {
3        long low = 1;
4        long high = num;
5        while (low <= high) {
6            long mid = low + (high - low) / 2;
7            long square = mid * mid;
8            if (square == num) {
9                return true;
10            } 
11            else if (square < num) {
12                low = mid + 1;
13            } 
14            else {
15                high = mid - 1;
16            }
17        }
18        return false;
19    }
20}