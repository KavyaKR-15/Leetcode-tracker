// Last updated: 7/9/2026, 9:11:19 AM
class Solution {
    public int searchInsert(int[] nums, int target) {
        int a=0;
        for(int i=0;i<nums.length;i++){
            if(target<=nums[i]){
                a=i;
                break;
            }
            else{
                if(target>nums[i]){
                    a=i+1;
                }
            }
        }
        return a;
    }
}