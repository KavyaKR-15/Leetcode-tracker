// Last updated: 7/9/2026, 11:02:11 PM
1class Solution {
2    public int countSubstrings(String s) {
3        int res = 0;
4
5        for (int i = 0; i < s.length(); i++) {
6            res += count_palindrome(s, i, i);
7            res += count_palindrome(s, i, i + 1);
8        }
9
10        return res;        
11    }
12
13    private int count_palindrome(String s, int left, int right) {
14        int count = 0;
15        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
16            count++;
17            left--;
18            right++;
19        }
20        return count;
21    }
22
23}