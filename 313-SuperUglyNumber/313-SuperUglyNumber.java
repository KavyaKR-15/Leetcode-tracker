// Last updated: 9/19/2026, 5:20:30 PM
class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int k = primes.length;
        int[] ugly = new int[n];
        int[] index = new int[k];
        ugly[0] = 1;
        for (int i = 1; i < n; i++) {
            long min = Long.MAX_VALUE;
            for (int j = 0; j < k; j++) {
                long candidate = (long) ugly[index[j]] * primes[j];
                min = Math.min(min, candidate);
            }
            ugly[i] = (int) min;
            for (int j = 0; j < k; j++) {
                long candidate = (long) ugly[index[j]] * primes[j];
                if (candidate == min) {
                    index[j]++;
                }
            }
        }
        return ugly[n - 1];
    }
}