// Last updated: 8/10/2026, 4:06:47 PM
1class Solution {
2    public boolean canJump(int[] nums) {
3       int reachable = 0;
4       for(int i = 0; i < nums.length; i ++) {
5           if(i > reachable) return false;
6           reachable = Math.max(reachable, i + nums[i]);
7       } 
8       return true;
9    }
10}