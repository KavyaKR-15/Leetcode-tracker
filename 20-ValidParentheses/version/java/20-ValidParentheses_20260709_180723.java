// Last updated: 7/9/2026, 6:07:23 PM
1class Solution {
2    public String convertToTitle(int columnNumber) {
3        StringBuilder ans=new StringBuilder();
4        while(columnNumber!=0){
5            columnNumber--;
6            ans.append((char)(((columnNumber)%26)+'A'));
7            columnNumber=columnNumber/26;
8        }
9        return ans.reverse().toString();
10    }
11}