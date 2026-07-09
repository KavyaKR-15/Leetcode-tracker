// Last updated: 7/9/2026, 6:24:49 PM
1class Solution {
2    public void reverseString(char[] s) {
3        int start = 0;
4        int end = s.length - 1;
5
6        while(start <= end){
7
8            char temp = s[start];
9            s[start] = s[end];
10            s[end] = temp;
11
12            start++;
13            end--;
14        }
15    }
16}