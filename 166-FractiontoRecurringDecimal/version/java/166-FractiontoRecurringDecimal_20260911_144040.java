// Last updated: 9/11/2026, 2:40:40 PM
1class Solution {
2    public String fractionToDecimal(int numerator, int denominator) {
3        if (numerator == 0) {
4            return "0";
5        }
6        StringBuilder ans = new StringBuilder();
7        if ((numerator < 0) ^ (denominator < 0)) {
8            ans.append("-");
9        }
10        long n = Math.abs((long) numerator);
11        long d = Math.abs((long) denominator);
12        ans.append(n / d);
13        long remainder = n % d;
14        if (remainder == 0) {
15            return ans.toString();
16        }
17        ans.append(".");
18        HashMap<Long, Integer> map = new HashMap<>();
19        while (remainder != 0) {
20            if (map.containsKey(remainder)) {
21                int pos = map.get(remainder);
22                ans.insert(pos, "(");
23                ans.append(")");
24                break;
25            }
26            map.put(remainder, ans.length());
27            remainder = remainder * 10;
28            ans.append(remainder / d);
29            remainder = remainder % d;
30        }
31        return ans.toString();
32    }
33}