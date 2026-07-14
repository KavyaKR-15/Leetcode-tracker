// Last updated: 7/14/2026, 11:25:39 AM
1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        List<List<Integer>> res = new ArrayList<>();
4        Arrays.sort(nums);
5        for (int i = 0; i < nums.length; i++) {
6            if (i > 0 && nums[i] == nums[i-1]) {
7                continue;
8            }
9            int j = i + 1;
10            int k = nums.length - 1;
11            while (j < k) {
12                int total = nums[i] + nums[j] + nums[k];
13                if (total > 0) {
14                    k--;
15                } else if (total < 0) {
16                    j++;
17                } else {
18                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
19                    j++;
20
21                    while (nums[j] == nums[j-1] && j < k) {
22                        j++;
23                    }
24                }
25            }
26        }
27        return res;        
28    }
29}