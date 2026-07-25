// Last updated: 7/25/2026, 4:20:18 PM
1class Solution {
2    public int maxProduct(int n) {
3        int a=0,b=0;
4        while(n>0){
5            int t=n%10;
6            if(t>a){
7                b=a;
8                a=t;
9            }
10            else if(t>b){
11                b=t;
12            }
13            n/=10;
14        }
15        return a*b;
16    }
17}