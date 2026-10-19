class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {

        List<Integer> list = new ArrayList<>();

        Arrays.sort(nums);
        int low = 0;
        int high = nums.length;

        for(int i = low; i < high; i++){

            int mid = low + (high - low) / 2;

            if(nums[i] == target){
                list.add(i);
            }

            else if(nums[i] > target){

                high = mid - 1;

            }else{
                low = mid + 1;
            }
        }

        return list;
    }
}