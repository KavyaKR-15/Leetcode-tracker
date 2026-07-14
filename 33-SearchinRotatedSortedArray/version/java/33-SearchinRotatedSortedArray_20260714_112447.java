// Last updated: 7/14/2026, 11:24:47 AM
1class Solution {
2    public int search(int[] nums, int target) {
3        int index=-1;
4        for(int i=0;i<nums.length;i++){
5            if(target==nums[i]){
6                index=i;
7            }
8        }
9        return index;
10    }
11}