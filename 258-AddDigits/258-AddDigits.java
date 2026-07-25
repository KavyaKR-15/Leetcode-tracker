// Last updated: 7/25/2026, 4:13:56 PM
class Solution {
    public int addDigits(int num) {
        int sum=0;
        while(num>0){
            int d=num%10;
            sum+=d;
            num/=10;
            if(sum>9 && num==0){
                num=sum;
                sum=0;
            }
        }
        return sum;
    }
}