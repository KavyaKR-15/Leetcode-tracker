// Last updated: 7/23/2026, 2:42:36 PM
1class Solution {
2    public String longestPalindrome(String s) {
3        String ans="";
4        int n=s.length();
5        for(int i=0;i<n;i++){
6            int left=i;
7            int right=i;
8            while(left>=0 && right<n && s.charAt(left)==s.charAt(right)){
9                if(right-left+1>ans.length()){
10                    ans=s.substring(left,right+1);
11                }
12                left--;
13                right++;
14            }
15            left=i;
16            right=i+1;
17            while(left>=0 && right<n && s.charAt(left)== s.charAt(right)){
18                if(right-left+1>ans.length()){
19                    ans=s.substring(left,right+1);
20                }
21                left--;
22                right++;
23            }
24        }
25        return ans;
26    }
27}