class Solution {
    public int atMost(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int sum = 0;
        int count = 0;

        while(right <= nums.length - 1){
            sum += nums[right] % 2;

            while(sum > k){
                sum = sum - nums[left] % 2;
                left = left + 1;
            }

            count = count + (right - left + 1);
            right++;
        }
        return count;
    }

    public int numberOfSubarrays(int[] nums, int k){
        return atMost(nums, k) - atMost(nums, k - 1);
    }
    
}