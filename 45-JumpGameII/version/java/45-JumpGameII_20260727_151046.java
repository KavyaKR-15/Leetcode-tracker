// Last updated: 7/27/2026, 3:10:46 PM
1class Solution {
2    public int jump(int[] nums) {
3        int jumps=0;
4        int current=0;
5        int farthest=0;
6        for(int i=0;i<nums.length-1;i++){
7            farthest=Math.max(farthest,i+nums[i]);
8            if(i==current){
9                jumps++;
10                current=farthest;
11            }
12        }
13        return jumps;
14    }
15}