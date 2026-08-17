// Last updated: 8/17/2026, 1:48:09 PM
1class Solution {
2    public int singleNumber(int[] nums) {
3        HashMap <Integer,Integer> map=new HashMap<>();
4        for(int i=0;i<nums.length;i++){
5            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
6        }
7        for(int i=0;i<nums.length;i++){
8            if(map.get(nums[i])==1){
9                return nums[i];
10            }
11        }
12        return -1;
13    }
14}