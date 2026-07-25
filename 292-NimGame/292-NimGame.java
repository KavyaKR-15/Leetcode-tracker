// Last updated: 7/25/2026, 4:13:52 PM
class Solution {
    public boolean canWinNim(int n) {
        if(n==1 || n==2) return true;
        else if(n>2){
            if(n%4==0) return false;
            else return true;
        }
        return false;
    }
}