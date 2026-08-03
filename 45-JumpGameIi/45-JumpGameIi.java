// Last updated: 8/3/2026, 5:39:10 PM
class Solution {
    public int jump(int[] nums) {
        int jumps=0;
        int current=0;
        int farthest=0;
        for(int i=0;i<nums.length-1;i++){
            farthest=Math.max(farthest,i+nums[i]);
            if(i==current){
                jumps++;
                current=farthest;
            }
        }
        return jumps;
    }
}