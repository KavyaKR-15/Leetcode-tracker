// Last updated: 8/3/2026, 5:36:30 PM
class Solution {
    public int minimumPushes(String A) {
        int q = A.length() >> 3;
        int r = A.length() & 7;
        return ((q << 2) + r) * (q + 1);
    }
}