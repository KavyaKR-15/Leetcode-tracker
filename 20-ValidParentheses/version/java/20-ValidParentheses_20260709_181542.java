// Last updated: 7/9/2026, 6:15:42 PM
1class Solution {
2    public int addDigits(int num) {
3        int sum=0;
4        while(num>0){
5            int d=num%10;
6            sum+=d;
7            num/=10;
8            if(sum>9 && num==0){
9                num=sum;
10                sum=0;
11            }
12        }
13        return sum;
14    }
15}