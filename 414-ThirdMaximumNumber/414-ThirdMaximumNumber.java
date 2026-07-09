// Last updated: 7/9/2026, 9:10:19 AM
class Solution {
    public int thirdMax(int[] nums) {
        int len=nums.length;
        int count=1;
        Arrays.sort(nums);
        for(int i=1;i<len;i++){
            if(nums[i]!=nums[i-1])count++;
        }
        int res[]=new int[count];
        int index=1;
        res[0]=nums[0];
        for(int i=1;i<len;i++){
            if(nums[i]!=nums[i-1]){
                res[index++]=nums[i];
            }
        }
        Arrays.sort(res);
        if(count>=3){
            return res[count-3];
        }
        return res[count-1];
    }
}