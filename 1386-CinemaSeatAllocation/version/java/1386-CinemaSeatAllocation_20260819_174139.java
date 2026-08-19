// Last updated: 8/19/2026, 5:41:39 PM
1import java.util.*;
2
3class Solution {
4    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
5        HashMap<Integer, Integer> map = new HashMap<>();
6        for (int[] seat : reservedSeats) {
7            int row = seat[0];
8            int col = seat[1];
9            map.put(row, map.getOrDefault(row, 0) | (1 << col));
10        }
11        int ans = (n - map.size()) * 2;
12        for (int seats : map.values()) {
13            boolean left  = (seats & 0b00111100) == 0;  
14            boolean middle = (seats & 0b11110000) == 0;
15            boolean right = (seats & 0b1111000000) == 0; 
16            if (left && right) {
17                ans += 2;
18            }
19            else if (left || middle || right) {
20                ans += 1;
21            }
22        }
23        return ans;
24    }
25}