// Last updated: 8/19/2026, 5:45:59 PM
1class Solution {
2    public boolean isInterleave(String s1, String s2, String s3) {
3        if (s1.length() + s2.length() != s3.length()) {
4            return false;
5        }
6        boolean[][] dp = new boolean[s1.length() + 1][s2.length() + 1];
7        dp[0][0] = true;
8        for (int i = 0; i <= s1.length(); i++) {
9            for (int j = 0; j <= s2.length(); j++) {
10                if (i == 0 && j == 0) {
11                    continue;
12                }
13                if (i > 0 && s1.charAt(i - 1) == s3.charAt(i + j - 1)) {
14                    dp[i][j] = dp[i][j] || dp[i - 1][j];
15                }
16                if (j > 0 && s2.charAt(j - 1) == s3.charAt(i + j - 1)) {
17                    dp[i][j] = dp[i][j] || dp[i][j - 1];
18                }
19            }
20        }
21        return dp[s1.length()][s2.length()];
22    }
23}