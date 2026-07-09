// Last updated: 7/9/2026, 9:10:25 AM
class Solution {
    public boolean isPowerOfFour(int n) {
        for(int i=0;i<128;i++){
            if(Math.pow(4,i)==n){
                return true;
            }
        }
        return false;
    }
}