// Last updated: 8/22/2026, 4:28:26 PM
1class Solution {
2    public void wiggleSort(int[] nums) {
3        int[] arr = nums.clone();
4        Arrays.sort(arr);
5        int n = nums.length;
6        int mid = (n - 1) / 2;
7        int high = n - 1;
8        for (int i = 0; i < n; i++) {
9            if (i % 2 == 0) {
10                nums[i] = arr[mid--];
11            } else {
12                nums[i] = arr[high--];
13            }
14        }
15    }
16}