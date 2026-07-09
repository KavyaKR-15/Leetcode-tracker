// Last updated: 7/9/2026, 9:11:04 AM
class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==0){
            return 0;
        }
        int count=1,max=0;
        for(int i=1;i<nums.length;i++){
                if(nums[i]!=nums[i-1]){
                    if(nums[i]==nums[i-1]+1){
                        count++;
                    }
                    else{
                        max=Math.max(max,count);
                        count=1;
                    }
                }
            
        }
        return Math.max(count,max);
    }
}