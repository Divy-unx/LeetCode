class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int minPos = -1;
        int maxPos = -1;
        int culpritidx = -1;
        long ans = 0;

        for(int i = 0; i < nums.length; i++){
            if (nums[i] < minK || nums[i] > maxK){
                culpritidx = i;
            }

            if(nums[i] == minK){
                minPos = i;
            }
            if(nums[i] == maxK){
                maxPos = i;
            }
            long smallest = Math.min(minPos, maxPos);
            long temp = (smallest - culpritidx);
            ans += (temp <= 0) ? 0 : temp;

        }
        return ans;
    }
}