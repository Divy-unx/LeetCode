class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] nge = new int[nums2.length];

        Stack<Integer> stack = new Stack<>();
        stack.push(nums2[nums2.length-1]);
        nge[nums2.length - 1] = -1;

        for(int i = nums2.length - 2; i >= 0; i--){
            while(stack.size() > 0 && nums2[i] >= stack.peek()){
                stack.pop();
            }

            if(stack.isEmpty()){
                nge[i] = -1;
            }else{
                nge[i] = stack.peek();
            }

            stack.push(nums2[i]);
        }


        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums2.length; i++){
            map.put(nums2[i], nge[i]);
        }

        int[] ans = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++){
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }
}