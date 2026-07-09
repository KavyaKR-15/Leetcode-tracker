// Last updated: 7/9/2026, 6:09:55 PM
1class Solution {
2    public int titleToNumber(String columnTitle) {
3        int res=0;
4        for(int i=0;i<columnTitle.length();i++){
5            res=res*26+columnTitle.charAt(i)-'A'+1;
6        }
7        return res;
8    }
9}