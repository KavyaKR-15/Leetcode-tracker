// Last updated: 7/9/2026, 11:03:03 PM
1class Solution {
2    public boolean judgeCircle(String moves) {
3        int x = 0, y = 0;
4
5        for (char move : moves.toCharArray()) {
6            if (move == 'U') y++;
7            else if (move == 'D') y--;
8            else if (move == 'L') x--;
9            else if (move == 'R') x++;
10        }
11
12        return x == 0 && y == 0;
13    }
14}