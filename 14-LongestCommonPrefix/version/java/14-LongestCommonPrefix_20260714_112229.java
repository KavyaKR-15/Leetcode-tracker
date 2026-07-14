// Last updated: 7/14/2026, 11:22:29 AM
1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        Arrays.sort(strs);
4        String first=strs[0];
5        String last=strs[strs.length-1];
6        String res="";
7        for(int i=0;i<first.length()&&i<last.length();i++){
8            if(first.charAt(i)==last.charAt(i)){
9                res+=first.charAt(i);
10            }
11            else{
12                 break;
13            }
14        }
15        return res;
16    }
17}