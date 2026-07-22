// Last updated: 7/22/2026, 4:30:01 PM
1class Solution {
2    public int maxArea(int[] height) {
3        int maxArea = 0;
4        int left = 0;
5        int right = height.length - 1;
6        while (left < right) {
7            maxArea = Math.max(maxArea, (right - left) * Math.min(height[left], height[right]));
8            if (height[left] < height[right]) {
9                left++;
10            } else {
11                right--;
12            }
13        }
14        return maxArea;        
15    }
16}