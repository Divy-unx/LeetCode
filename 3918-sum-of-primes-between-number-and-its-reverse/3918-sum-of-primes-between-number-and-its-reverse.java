class Solution {
    public static boolean IsPrime(int num){
        if (num <= 1){
            return false;
        }
        for(int div = 2; div * div <= num; div++){
            if(num % div == 0){
                return false;
            }
        }
        return true;
    }
    public static int sumOfPrimesInRange(int n) {
        int sum = 0;
        int rev = 0;
        int num = n;

        while(num > 0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        int min = n;
        int max = rev;

        min = Math.min(min, rev);
        max = Math.max(max , n);

        for(int i = min; i <= max; i++){
            if(IsPrime(i)){
                sum = sum + i;
            }
        }
        return sum;
    }
}