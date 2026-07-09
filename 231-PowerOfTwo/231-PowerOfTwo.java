// Last updated: 7/9/2026, 9:10:43 AM
class Solution {
    public boolean isPowerOfTwo(int n) {
        for(int i=0;i<128;i++){
            if(Math.pow(2,i)==n){
                return true;
            }
        }
        return false;
    }
}