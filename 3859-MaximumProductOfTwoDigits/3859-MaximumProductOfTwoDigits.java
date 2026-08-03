// Last updated: 8/3/2026, 5:36:28 PM
class Solution {
    public int maxProduct(int n) {
        int a=0,b=0;
        while(n>0){
            int t=n%10;
            if(t>a){
                b=a;
                a=t;
            }
            else if(t>b){
                b=t;
            }
            n/=10;
        }
        return a*b;
    }
}