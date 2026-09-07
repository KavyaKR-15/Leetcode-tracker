// Last updated: 9/7/2026, 4:22:57 PM
class Solution {
    public boolean judgeSquareSum(int c) {
        long left = 0;
        long right = (long) Math.sqrt(c);
        while (left <= right) {
            long sum = left * left + right * right;

            if (sum == c) {
                return true;
            } 
            else if (sum < c) {
                left++;
            } 
            else {
                right--;
            }
        }
        return false;
    }
}