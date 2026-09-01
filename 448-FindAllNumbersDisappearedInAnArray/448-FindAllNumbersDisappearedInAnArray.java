// Last updated: 9/1/2026, 2:40:46 PM
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        boolean[] seen = new boolean[n + 1];
        List<Integer> result = new ArrayList<>();
        for (int num : nums) {
            seen[num] = true;
        }
        for (int i = 1; i <= n; i++) {
            if (!seen[i]) {
                result.add(i);
            }
        }
        return result;
    }
}