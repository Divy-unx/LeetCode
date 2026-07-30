class Solution {
     public int atMost(int[] nums, int goal) {
        if(goal < 0){
            return 0;
        }
        int left = 0;
        int right = 0;
        int sum = 0;
        int count = 0;

        while(right <= nums.length - 1){
            sum += nums[right];

            while(sum > goal){
                sum = sum - nums[left];
                left = left + 1;
            }

            count = count + (right - left + 1);
            right++;
        }
        return count;
    
    }

    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal - 1);
    }
     
}