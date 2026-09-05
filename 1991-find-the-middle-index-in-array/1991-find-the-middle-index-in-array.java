class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int left = 0;
        int total = 0;

        for(int i = 0; i < n ; i++){
            total += nums[i];
        }

        for(int i = 0; i < n; i++){
            int right = total - left - nums[i];

            if(left == right){
                return i;
            }  

            left = left + nums[i];
        }

        return -1;
    }
}