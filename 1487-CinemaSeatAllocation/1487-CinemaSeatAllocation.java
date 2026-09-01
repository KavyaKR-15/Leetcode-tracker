// Last updated: 9/1/2026, 2:40:26 PM
import java.util.*;

class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int[] seat : reservedSeats) {
            int row = seat[0];
            int col = seat[1];
            map.put(row, map.getOrDefault(row, 0) | (1 << col));
        }
        int ans = (n - map.size()) * 2;
        for (int seats : map.values()) {
            boolean left  = (seats & 0b00111100) == 0;  
            boolean middle = (seats & 0b11110000) == 0;
            boolean right = (seats & 0b1111000000) == 0; 
            if (left && right) {
                ans += 2;
            }
            else if (left || middle || right) {
                ans += 1;
            }
        }
        return ans;
    }
}