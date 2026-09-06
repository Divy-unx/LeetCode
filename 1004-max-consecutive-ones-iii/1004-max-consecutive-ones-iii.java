class Solution {
    public int longestOnes(int[] nums, int k) {
        int count = 0;
        int maxlen = 0;
        int left = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                count++;
            }

            while(count > k){
                if(nums[left] == 0){
                    count--;
                }

                left++;
            }

            maxlen = Math.max(maxlen, i-left + 1);

           
        }
        return maxlen;
    }
}