// Last updated: 7/9/2026, 11:05:30 PM
1class Solution {
2    public int pivotIndex(int[] nums) {
3        int totalSum = 0;
4        for(int num: nums){
5            totalSum += num;
6        }
7        int leftSum = 0;
8        for(int i = 0; i < nums.length; i++){
9            int rightSum = totalSum - leftSum - nums[i];
10
11            if(leftSum == rightSum){
12                return i;
13            }
14            leftSum += nums[i];
15        }
16        return -1;
17    }
18}