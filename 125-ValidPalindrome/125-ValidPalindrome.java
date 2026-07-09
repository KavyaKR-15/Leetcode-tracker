// Last updated: 7/9/2026, 9:11:06 AM
class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String sb=new StringBuilder(s).reverse().toString();
        if(s.equals(sb)){
            return true;
        }
        return false;
    }
}