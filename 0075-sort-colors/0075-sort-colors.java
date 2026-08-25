class Solution {
    public void swap(int[] nums, int left, int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
    public void sortColors(int[] nums) {
        int i = 0;
        int j = 0;
        int k = nums.length - 1;

        while(j <= k){
            if(nums[j] == 1){
                j++;
            }else if(nums[j] == 0){
                swap(nums,j,i);
                i++;
                j++;
            }else{
                swap(nums, j,k);
                k--;
            }
        }
    }
}