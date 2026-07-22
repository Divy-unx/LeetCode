import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mapp = new HashMap<>();
        int n = nums.length;
        for(int i = 0; i<n; i++){
            int a = nums[i];
            int more = target - a;
            if(mapp.containsKey(more)){
                return new int[] {mapp.get(more) , i};
            }
            mapp.put(a,i);
        } 
        return new int[] {};
    }
}