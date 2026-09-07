// Last updated: 9/7/2026, 4:22:16 PM
class Solution {
    public int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        while (max % min != 0) {
            int rem = max % min;
            max = min;
            min = rem;
        }
        return min;
    }
}