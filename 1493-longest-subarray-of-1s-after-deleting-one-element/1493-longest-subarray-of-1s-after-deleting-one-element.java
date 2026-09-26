class Solution {
    public int longestSubarray(int[] nums) {
        int maxlen = 0;
        int zeroescount = 0;
        int i = 0;

        for(int j = 0; j < nums.length; j++){
            if(nums[j] == 0){
                zeroescount++;
            }

            while(zeroescount > 1){
                if(nums[i] == 0){
                    zeroescount--;
                }

                i++;
            }

            maxlen = Math.max(maxlen, j - i);
        }

        if(zeroescount == 0){
            return nums.length - 1;
        }

        return maxlen;
    }
}