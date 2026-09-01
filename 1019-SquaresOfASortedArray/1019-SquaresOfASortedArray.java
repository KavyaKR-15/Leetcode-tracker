// Last updated: 9/1/2026, 2:40:33 PM
class Solution {
    public int[] sortedSquares(int[] nums) {
        int res[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            res[i]=(int)Math.pow(nums[i],2);
        }
        Arrays.sort(res);
        return res;
    }
}