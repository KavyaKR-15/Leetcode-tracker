// Last updated: 7/9/2026, 10:57:58 PM
1class Solution {
2    public int fib(int n) {
3        if(n==0) return 0;
4        if(n==1) return 1;
5        int a=0,b=1;
6        int res=0;
7        for(int i=2;i<=n;i++){
8            res=a+b;
9            a=b;
10            b=res;
11        }
12        return res;
13    }
14}