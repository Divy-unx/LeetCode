class Solution {
   public int myAtoi(String s) {
    s = s.trim();

    if (s.isEmpty()) {
        return 0;
    }

    int i = 0;
    int n = s.length();
    int sign = 1;
    long ans = 0;

    if (s.charAt(i) == '-') {
        sign = -1;
        i++;
    } else if (s.charAt(i) == '+') {
        i++;
    }

    while (i < n) {
        char ch = s.charAt(i);

        if (ch < '0' || ch > '9') {
            break;
        }

        int digit = ch - '0';
        ans = ans * 10 + digit;

        long result = ans * sign;

        if (result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }

        if (result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        i++;
    }

    return (int) (ans * sign);
    }
}