// Last updated: 8/3/2026, 5:34:46 PM
1class Solution {
2    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
3        int area1 = (ax2 - ax1) * (ay2 - ay1);
4        int area2 = (bx2 - bx1) * (by2 - by1);
5        int width= Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1));
6        int height = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1));
7        int over = width * height;
8        return area1 + area2 - over;
9    }
10}