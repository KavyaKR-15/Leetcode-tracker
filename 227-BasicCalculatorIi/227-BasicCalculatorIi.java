// Last updated: 7/9/2026, 9:10:45 AM
class Solution {
    public int calculate(String s) {
        int res = 0;
        int last = 0;
        int num = 0;
        char op = '+';

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }

            if ((!Character.isDigit(ch) && ch != ' ') || i == s.length() - 1) {
                switch (op) {
                    case '+':
                        res += last;
                        last = num;
                        break;
                    case '-':
                        res += last;
                        last = -num;
                        break;
                    case '*':
                        last = last * num;
                        break;
                    case '/':
                        last = last / num;
                        break;
                }

                op = ch;
                num = 0;
            }
        }

        return res + last;
    }
}