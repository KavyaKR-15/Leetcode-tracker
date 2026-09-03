// Last updated: 9/3/2026, 2:20:31 PM
1class Solution {
2    public boolean uniformArray(int[] nums1) {
3        int minOdd = Integer.MAX_VALUE;
4        for (int x : nums1) {
5            if (x % 2 == 1) {
6                minOdd = Math.min(minOdd, x);
7            }
8        }
9        if (minOdd == Integer.MAX_VALUE) {
10            return true;
11        }
12        for (int x : nums1) {
13            if (x % 2 == 0 && x <= minOdd) {
14                return false;
15            }
16        }
17        return true;
18    }
19}