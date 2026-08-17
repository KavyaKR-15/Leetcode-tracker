// Last updated: 8/17/2026, 2:11:15 PM
1class Solution {
2    public int pivotInteger(int n) {
3        int total=0;
4        for(int i=1;i<=n;i++){
5            total+=i;
6        }
7        int left=0;
8        for(int i=1;i<=n;i++){
9            int right=total-left-i;
10            if(right==left){
11                return i;
12            }
13            left+=i;
14        }
15        return -1;
16    }
17}