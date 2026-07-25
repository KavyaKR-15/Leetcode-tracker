// Last updated: 7/25/2026, 4:13:44 PM
class Solution {
    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(s);
        Arrays.sort(g);

        int i = 0, j = 0, n = g.length, m = s.length;

        while (i<n && j<m) {
            if (s[j] >= g[i]) i++;
            j++;
        }

        return i;
    }
}