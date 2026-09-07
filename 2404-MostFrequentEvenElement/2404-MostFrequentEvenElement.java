// Last updated: 9/7/2026, 4:22:08 PM
class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
        }
        int ans=-1,max=0;
        for(int k:map.keySet()){
            int freq=map.get(k);
            if(freq>max ||( freq==max && ans>k)){
                max=freq;
                ans=k;
            }
        }
        return ans;
    }
}