class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int[] nge = new int[nums.length];
        int N = nums.length;
        for(int i = 2*N - 1; i > 0; i--){
            while(stack.size() > 0 && stack.peek() <= nums[i % N]){
                stack.pop();
            }

            if(stack.isEmpty()){
                nge[i % N] = -1;
            }else{
                nge[i % N] = stack.peek();
            }

            stack.push(nums[i % N]);
        }
        return nge;
    }
}