// Last updated: 8/17/2026, 2:01:41 PM
1class Solution {
2    public int[] singleNumber(int[] nums) {
3        HashMap <Integer,Integer> map=new HashMap<>();
4        for(int i=0;i<nums.length;i++){
5            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
6        }
7        int res[]=new int[2];
8        int m=0;
9        for(int i=0;i<nums.length;i++){
10            if(map.get(nums[i])==1){
11                res[m]=nums[i];
12                m++;
13            }
14        }
15        return res;
16    }
17}