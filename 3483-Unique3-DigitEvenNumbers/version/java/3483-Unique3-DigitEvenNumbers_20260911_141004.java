// Last updated: 9/11/2026, 2:10:04 PM
1class Solution {
2    public int totalNumbers(int[] digits) {
3        boolean[] used = new boolean[1000];
4        int count = 0;
5        for (int i = 0; i < digits.length; i++) {
6            for (int j = 0; j < digits.length; j++) {
7                for (int k = 0; k < digits.length; k++) {
8                    if (i == j || i == k || j == k) {
9                        continue;
10                    }
11                    if (digits[i] == 0) {
12                        continue;
13                    }
14                    if (digits[k] % 2 != 0) {
15                        continue;
16                    }
17                    int num = digits[i] * 100 + digits[j] * 10 + digits[k];
18                    if (!used[num]) {
19                        used[num] = true;
20                        count++;
21                    }
22                }
23            }
24        }
25        return count;
26    }
27}