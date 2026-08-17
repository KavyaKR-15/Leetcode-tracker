// Last updated: 8/17/2026, 2:17:47 PM
1class Solution {
2    public int findMiddleIndex(int[] nums) {
3        int total=0;
4        for(int i:nums){
5            total+=i;
6        }
7        int left=0;
8        for(int i=0;i<nums.length;i++){
9            int right=total-left-nums[i];
10            if(right==left){
11                return i;
12            }
13            left+=nums[i];
14        }
15        return -1;
16    }
17}