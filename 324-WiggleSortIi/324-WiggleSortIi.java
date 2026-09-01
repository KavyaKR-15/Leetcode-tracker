// Last updated: 9/1/2026, 2:41:02 PM
class Solution {
    public void wiggleSort(int[] nums) {
        int[] arr = nums.clone();
        Arrays.sort(arr);
        int n = nums.length;
        int mid = (n - 1) / 2;
        int high = n - 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                nums[i] = arr[mid--];
            } else {
                nums[i] = arr[high--];
            }
        }
    }
}