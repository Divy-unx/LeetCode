class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        int min = nums[0];
        int max = nums[nums.length-1];

        for (int num : nums) {
            set.add(num);
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        for(int j = min; j <= max; j++){
            if(!set.contains(j)){
                list.add(j);
            }
        }
        return list;

    }
}