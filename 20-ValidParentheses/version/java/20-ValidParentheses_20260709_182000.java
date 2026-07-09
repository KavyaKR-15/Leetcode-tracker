// Last updated: 7/9/2026, 6:20:00 PM
1class Solution {
2    public boolean canWinNim(int n) {
3        if(n==1 || n==2) return true;
4        else if(n>2){
5            if(n%4==0) return false;
6            else return true;
7        }
8        return false;
9    }
10}