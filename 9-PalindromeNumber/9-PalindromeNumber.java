// Last updated: 7/9/2026, 9:11:30 AM
class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int rev=0;
        while(temp>0){
            int d=temp%10;
            rev=rev*10+d;
            temp/=10;
        }
        if(rev==x){
            return true;
        }
        return false;
    }
}