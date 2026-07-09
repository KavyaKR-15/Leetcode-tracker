// Last updated: 7/9/2026, 9:10:27 AM
class Solution {
    public boolean isPowerOfThree(int n) {
        for(int i=0;i<128;i++){
            if(Math.pow(3,i)==n)
            return true;
        }
        return false;
    }
}