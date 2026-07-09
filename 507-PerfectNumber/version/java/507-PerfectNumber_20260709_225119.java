// Last updated: 7/9/2026, 10:51:19 PM
1class Solution {
2    public boolean checkPerfectNumber(int num) {
3        if(num<=1) return false;
4        int sum=0;
5        for(int i=1;i<=num/2;i++){
6            if(num%i==0){
7                sum+=i;
8            }
9        }
10        if(sum==num) return true;
11        return false;
12    }
13}