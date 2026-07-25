// Last updated: 7/25/2026, 4:14:30 PM
class Solution {
    public int search(int[] nums, int target) {
        int index=-1;
        for(int i=0;i<nums.length;i++){
            if(target==nums[i]){
                index=i;
            }
        }
        return index;
    }
}