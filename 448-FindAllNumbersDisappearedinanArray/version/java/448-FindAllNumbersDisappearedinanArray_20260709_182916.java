// Last updated: 7/9/2026, 6:29:16 PM
1class Solution {
2    public int findContentChildren(int[] g, int[] s) {
3
4        Arrays.sort(s);
5        Arrays.sort(g);
6
7        int i = 0, j = 0, n = g.length, m = s.length;
8
9        while (i<n && j<m) {
10            if (s[j] >= g[i]) i++;
11            j++;
12        }
13
14        return i;
15    }
16}