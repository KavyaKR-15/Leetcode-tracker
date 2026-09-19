// Last updated: 9/19/2026, 5:20:21 PM
class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) {
            return 1;
        }
        int ans = 10;
        int unique = 9;
        for (int i = 2; i <= n; i++) {
            unique *= (11 - i);
            ans += unique;
        }
        return ans;
    }
}