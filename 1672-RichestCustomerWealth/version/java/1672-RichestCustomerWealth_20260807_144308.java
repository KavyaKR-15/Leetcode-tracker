// Last updated: 8/7/2026, 2:43:08 PM
1class Solution {
2    public int maximumWealth(int[][] accounts) {
3        int max=0;
4        for(int i=0;i<accounts.length;i++){
5            int sum=0;
6            for(int j=0;j<accounts[i].length;j++){
7                sum+=accounts[i][j];
8            }
9            max=Math.max(sum,max);
10        }
11        return max;
12    }
13}