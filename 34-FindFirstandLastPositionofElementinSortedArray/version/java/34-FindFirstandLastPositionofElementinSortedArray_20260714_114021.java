// Last updated: 7/14/2026, 11:40:21 AM
1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3        int res[]={-1,-1};
4        for(int i=0;i<nums.length;i++){
5            if(target==nums[i]){
6                res[0]=i;
7                break;
8            }
9        }
10        for(int i=nums.length-1;i>=0;i--){
11            if(target==nums[i]){
12                res[1]=i;
13                break;
14            }
15        }
16        return res;
17    }
18}