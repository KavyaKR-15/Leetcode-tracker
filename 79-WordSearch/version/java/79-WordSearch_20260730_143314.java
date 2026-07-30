// Last updated: 7/30/2026, 2:33:14 PM
1class Solution {
2    public boolean exist(char[][] board, String word) {
3        for (int i = 0; i < board.length; i++) {
4            for (int j = 0; j < board[0].length; j++) {
5                if (dfs(board, word, i, j, 0))
6                    return true;
7            }
8        }
9        return false;
10    }
11    public boolean dfs(char[][] board, String word, int i, int j, int index) {
12        if (index == word.length())
13            return true;
14        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length)
15            return false;
16        if (board[i][j] != word.charAt(index))
17            return false;
18        char temp = board[i][j];
19        board[i][j] = '#';
20        boolean found =
21                dfs(board, word, i + 1, j, index + 1) ||
22                dfs(board, word, i - 1, j, index + 1) ||
23                dfs(board, word, i, j + 1, index + 1) ||
24                dfs(board, word, i, j - 1, index + 1);
25        board[i][j] = temp;
26        return found;
27    }
28}