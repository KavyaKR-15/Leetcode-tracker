// Last updated: 7/30/2026, 4:11:26 PM
1class Solution {
2    public int findGCD(int[] nums) {
3        int min = nums[0];
4        int max = nums[0];
5        for (int num : nums) {
6            if (num < min) {
7                min = num;
8            }
9            if (num > max) {
10                max = num;
11            }
12        }
13        while (max % min != 0) {
14            int rem = max % min;
15            max = min;
16            min = rem;
17        }
18        return min;
19    }
20}