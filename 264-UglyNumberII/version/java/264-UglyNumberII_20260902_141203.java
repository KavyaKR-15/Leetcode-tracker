// Last updated: 9/2/2026, 2:12:03 PM
1class Solution {
2    public int nthUglyNumber(int n) {
3        int[] ugly = new int[n];
4        ugly[0] = 1;
5        int i2 = 0, i3 = 0, i5 = 0;
6        for (int i = 1; i < n; i++) {
7            int next = Math.min(ugly[i2] * 2,Math.min(ugly[i3] * 3, ugly[i5] * 5));
8            ugly[i] = next;
9            if (next == ugly[i2] * 2)
10                i2++;
11            if (next == ugly[i3] * 3)
12                i3++;
13
14            if (next == ugly[i5] * 5)
15                i5++;
16        }
17        return ugly[n - 1];
18    }
19}