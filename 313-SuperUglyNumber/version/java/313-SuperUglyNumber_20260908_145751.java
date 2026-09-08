// Last updated: 9/8/2026, 2:57:51 PM
1class Solution {
2    public int nthSuperUglyNumber(int n, int[] primes) {
3        int k = primes.length;
4        int[] ugly = new int[n];
5        int[] index = new int[k];
6        ugly[0] = 1;
7        for (int i = 1; i < n; i++) {
8            long min = Long.MAX_VALUE;
9            for (int j = 0; j < k; j++) {
10                long candidate = (long) ugly[index[j]] * primes[j];
11                min = Math.min(min, candidate);
12            }
13            ugly[i] = (int) min;
14            for (int j = 0; j < k; j++) {
15                long candidate = (long) ugly[index[j]] * primes[j];
16                if (candidate == min) {
17                    index[j]++;
18                }
19            }
20        }
21        return ugly[n - 1];
22    }
23}