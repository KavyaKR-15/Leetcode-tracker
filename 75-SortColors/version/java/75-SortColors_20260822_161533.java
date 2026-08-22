// Last updated: 8/22/2026, 4:15:33 PM
1class Solution {
2    public void sortColors(int[] nums) {
3        for(int i=0;i<nums.length;i++){
4            for(int j=0;j<nums.length;j++){
5                if(nums[i]<nums[j]){
6                    int temp=nums[i];
7                    nums[i]=nums[j];
8                    nums[j]=temp;
9                }
10            }
11        }
12    }
13}