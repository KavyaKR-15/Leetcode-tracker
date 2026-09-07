// Last updated: 9/7/2026, 4:23:12 PM
class Solution {
    public boolean isPerfectSquare(int num) {
        long low = 1;
        long high = num;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            long square = mid * mid;
            if (square == num) {
                return true;
            } 
            else if (square < num) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }
        return false;
    }
}