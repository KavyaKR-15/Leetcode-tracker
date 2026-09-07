// Last updated: 9/7/2026, 4:21:51 PM
class Solution {
    public boolean uniformArray(int[] nums1) {
        int minOdd = Integer.MAX_VALUE;
        for (int x : nums1) {
            if (x % 2 == 1) {
                minOdd = Math.min(minOdd, x);
            }
        }
        if (minOdd == Integer.MAX_VALUE) {
            return true;
        }
        for (int x : nums1) {
            if (x % 2 == 0 && x <= minOdd) {
                return false;
            }
        }
        return true;
    }
}