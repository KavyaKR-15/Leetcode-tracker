// Last updated: 9/1/2026, 2:41:17 PM
class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int res[]=new int[2];
        int m=0;
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])==1){
                res[m]=nums[i];
                m++;
            }
        }
        return res;
    }
}