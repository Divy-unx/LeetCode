class Solution {
    public boolean isPalindrome(int x) {
        if( x < 0){
            return false;
        }
        int num = x;
        int rev = 0;

        while(num > 0){
            int digit= num % 10; // 121 % 10 = 1, 12 % 10 = 2, 1 % 10 = 1
            rev = rev * 10 + digit; // 0 + 1 = 1, 10 + 2 = 12, 120 + 1= 121
            num = num / 10; // 121 / 10 = 12, 12 / 10 = 1, 1/10 = 0

        }
        return rev == x;
    }
}