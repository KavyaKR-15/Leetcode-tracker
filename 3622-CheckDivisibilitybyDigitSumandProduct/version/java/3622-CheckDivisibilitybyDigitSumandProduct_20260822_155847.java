// Last updated: 8/22/2026, 3:58:47 PM
1class Solution {
2    public boolean checkDivisibility(int n) {
3        int sum=0,pd=1;
4        int temp=n;
5        while(temp>0){
6            int t=temp%10;
7            sum+=t;
8            pd*=t;
9            temp/=10;
10        }
11        int res=sum+pd;
12        if(n%res==0){
13            return true;
14        }
15        return false;
16    }
17}