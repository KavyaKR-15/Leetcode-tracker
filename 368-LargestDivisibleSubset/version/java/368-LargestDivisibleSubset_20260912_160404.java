// Last updated: 9/12/2026, 4:04:04 PM
1class Solution {
2    public List<Integer> largestDivisibleSubset(int[] nums) {
3        int n = nums.length;
4        Arrays.sort(nums);
5        int[] dp = new int[n];
6        int[] parent = new int[n];
7        Arrays.fill(dp, 1);
8        int maxLength = 0;
9        int lastIdx = 1;
10        for(int i = 0; i < n; i++){
11            parent[i] = i;
12            for(int j = 0; j < i; j++){
13                if(nums[i] % nums[j] == 0 && dp[i] < dp[j] + 1){
14                    dp[i] = dp[j] + 1;
15                    parent[i] = j;
16
17                }
18            }
19            if(maxLength < dp[i]){
20                maxLength = dp[i];
21                lastIdx = i;
22            }
23        }
24        List<Integer> list = new ArrayList<>();
25        list.add(nums[lastIdx]);
26        while(parent[lastIdx] != lastIdx){
27            lastIdx = parent[lastIdx];
28            list.add(nums[lastIdx]);
29        }
30        Collections.reverse(list);
31        return list;
32    }
33}