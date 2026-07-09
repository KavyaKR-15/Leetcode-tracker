// Last updated: 7/9/2026, 9:10:59 AM
class Solution {
    public int majorityElement(int[] nums) {
        // int maj=0,k=0;
        // for(int i=0;i<nums.length;i++){
        //     int count=1;
        //     for(int j=i+1;j<nums.length;j++){
        //     if(nums[i]==nums[j]){
        //         count++;
        //     }
        //     }
        //     if(count>maj){
        //         maj=count;
        //         k=nums[i];
        // }
        // }
        // int res=nums.length/2;
        // if(maj>res){
        //     return k;
        // }
        // return 0;
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}