// Last updated: 9/1/2026, 2:39:53 PM
class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0,pd=1;
        int temp=n;
        while(temp>0){
            int t=temp%10;
            sum+=t;
            pd*=t;
            temp/=10;
        }
        int res=sum+pd;
        if(n%res==0){
            return true;
        }
        return false;
    }
}