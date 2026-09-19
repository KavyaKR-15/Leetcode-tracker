// Last updated: 9/19/2026, 5:21:01 PM
class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) {
            return "0";
        }
        StringBuilder ans = new StringBuilder();
        if ((numerator < 0) ^ (denominator < 0)) {
            ans.append("-");
        }
        long n = Math.abs((long) numerator);
        long d = Math.abs((long) denominator);
        ans.append(n / d);
        long remainder = n % d;
        if (remainder == 0) {
            return ans.toString();
        }
        ans.append(".");
        HashMap<Long, Integer> map = new HashMap<>();
        while (remainder != 0) {
            if (map.containsKey(remainder)) {
                int pos = map.get(remainder);
                ans.insert(pos, "(");
                ans.append(")");
                break;
            }
            map.put(remainder, ans.length());
            remainder = remainder * 10;
            ans.append(remainder / d);
            remainder = remainder % d;
        }
        return ans.toString();
    }
}