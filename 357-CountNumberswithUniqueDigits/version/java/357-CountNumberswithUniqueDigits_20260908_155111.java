// Last updated: 9/8/2026, 3:51:11 PM
1class Solution {
2    public int countNumbersWithUniqueDigits(int n) {
3        if (n == 0) {
4            return 1;
5        }
6        int ans = 10;
7        int unique = 9;
8        for (int i = 2; i <= n; i++) {
9            unique *= (11 - i);
10            ans += unique;
11        }
12        return ans;
13    }
14}