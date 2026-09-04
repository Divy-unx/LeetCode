class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        prefix[0] = 1;
        int[] suffix = new int[nums.length];
        suffix[nums.length - 1] = 1;
        int[] ans = new int[nums.length];

        int p = 1;
        for(int i = 1; i < nums.length; i++){
            p *= nums[i-1];
            prefix[i] = p;
        }

        int product = 1;
        for(int i = nums.length - 2; i >= 0; i--){
            product *= nums[i+1];
            suffix[i] = product;
        }

        for(int i = 0; i < nums.length; i++){
            ans[i] = prefix[i] * suffix[i];
        }

        return ans;
    }
}