// Last updated: 7/25/2026, 4:13:48 PM
class Solution {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;

        while(start <= end){

            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            start++;
            end--;
        }
    }
}