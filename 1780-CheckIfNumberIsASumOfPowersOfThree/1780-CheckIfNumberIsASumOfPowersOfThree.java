// Last updated: 9/7/2026, 4:22:25 PM
class Solution {
    public boolean checkPowersOfThree(int n) {
        while(n>0){
            if(n%3>=2){
                return false;
            }
            n/=3;
        }
        return true;
    }
}