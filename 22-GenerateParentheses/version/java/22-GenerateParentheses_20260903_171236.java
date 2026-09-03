// Last updated: 9/3/2026, 5:12:36 PM
1class Solution {
2    public List<String> generateParenthesis(int n) {
3        List<String> result = new ArrayList<>();
4        backtrack(result, "", 0, 0, n);
5        return result;
6    }
7    void backtrack(List<String> result, String s, int open, int close, int n) {
8        if (s.length() == 2 * n) {
9            result.add(s);
10            return;
11        }
12        if (open < n) {
13            backtrack(result, s + "(", open + 1, close, n);
14        }
15        if (close < open) {
16            backtrack(result, s + ")", open, close + 1, n);
17        }
18    }
19}