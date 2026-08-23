class Solution {
    public int reverse(int x) {
        boolean neg = false;
        if(x < 0){
            neg = true;
            x = -x;
        }
        long rev = 0;
        while(x > 0){
            int digit = x % 10;
            rev = rev * 10 + digit;
            x = x / 10;
        }

        if(neg){
            rev = -rev;
        }

        if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE){
            return 0;
        }

        return (int)rev;

    }
}