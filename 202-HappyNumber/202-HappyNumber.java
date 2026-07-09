// Last updated: 7/9/2026, 9:10:53 AM
class Solution {
    public boolean isHappy(int n) {
        int sum;
        while(n!=1 && n!=4){
            sum=0;
            int num=n;
        while(num!=0){
            int digit=num%10;
            sum+=Math.pow(digit,2);
            num/=10;
        }
        n=sum;
        }
       return n==1;
    }
}