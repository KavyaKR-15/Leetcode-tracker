// Last updated: 8/18/2026, 2:34:10 PM
1class Solution {
2    public int[] sortedSquares(int[] nums) {
3        int res[]=new int[nums.length];
4        for(int i=0;i<nums.length;i++){
5            res[i]=(int)Math.pow(nums[i],2);
6        }
7        Arrays.sort(res);
8        return res;
9    }
10}