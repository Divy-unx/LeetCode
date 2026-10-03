class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int[] nums = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();

        for(int i = temperatures.length - 1; i >= 0; i--){
            while(!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]){
                stack.pop();
            }

            if(!stack.isEmpty()){
                nums[i] = stack.peek() - i;
            }

            stack.push(i);
        }
        return nums;
    }
}