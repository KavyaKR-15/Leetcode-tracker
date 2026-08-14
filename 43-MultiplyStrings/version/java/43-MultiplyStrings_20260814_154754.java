// Last updated: 8/14/2026, 3:47:54 PM
1class Solution {
2   public String multiply(String num1, String num2) {
3    int m = num1.length(), n = num2.length();
4    int[] pos = new int[m + n];
5    for(int i = m - 1; i >= 0; i--) {
6        for(int j = n - 1; j >= 0; j--) {
7            int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0'); 
8            int p1 = i + j, p2 = i + j + 1;
9            int sum = mul + pos[p2];
10            pos[p1] += sum / 10;
11            pos[p2] = (sum) % 10;
12        }
13    }  
14    StringBuilder sb = new StringBuilder();
15    for(int p : pos) if(!(sb.length() == 0 && p == 0)) sb.append(p);
16    return sb.length() == 0 ? "0" : sb.toString();
17}
18}