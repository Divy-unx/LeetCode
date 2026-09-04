class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] suffix = new int[nums.length];
        suffix[nums.length - 1] = 1;
        int[] ans = new int[nums.length];
        ans[0] = 1;

        int p = 1;
        for(int i = 1; i < nums.length; i++){
            p *= nums[i-1];
            ans[i] = p;
        }

        int product = 1;
        for(int i = nums.length - 2; i >= 0; i--){
            product *= nums[i+1];
            suffix[i] = product;
            ans[i] *= suffix[i];
        }

        return ans;
    }
}