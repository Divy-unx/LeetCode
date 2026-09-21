class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int pro = 1;
        int count = 0;
        
        while(j < nums.length){
            pro = pro * nums[j];

            while(pro >= k && i <= j){
                pro = pro / nums[i];
                i++;
            }

            count += j - i + 1;
            j++;
        }
        return count;
    }
}