class Solution {
    public int sumOddLengthSubarrays(int[] nums) {
        int sum = 0;
        int length = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i; j < nums.length; j++){
                length = j - i + 1;
                if(length % 2 == 1){
                    for(int k = i; k <= j; k++){
                        sum = sum + nums[k];
                    }
                }
            }
        }
        return sum;
    }
}