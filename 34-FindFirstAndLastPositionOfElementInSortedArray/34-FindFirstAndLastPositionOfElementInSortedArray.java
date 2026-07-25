// Last updated: 7/25/2026, 4:14:29 PM
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res[]={-1,-1};
        for(int i=0;i<nums.length;i++){
            if(target==nums[i]){
                res[0]=i;
                break;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            if(target==nums[i]){
                res[1]=i;
                break;
            }
        }
        return res;
    }
}