// Last updated: 7/9/2026, 9:10:46 AM
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int res=Math.abs(i-j);
                if(res>k){
                    break;
                }
                    if(nums[i]==nums[j]){
                        return true;
                    }
            }
        }
        return false;
    }
}