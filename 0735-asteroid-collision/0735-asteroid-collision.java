class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();


        for(int i : asteroids){
            boolean destroyed = false;

            while(!stack.isEmpty() && stack.peek() > 0 && i < 0){
                int sum = stack.peek() + i;

                if(sum > 0){
                    destroyed = true;
                    break;
                }else if(sum < 0){
                    stack.pop();
                }else{
                    stack.pop();
                    destroyed = true;
                    break;
                }
            }
            
            if(!destroyed){
                stack.push(i);
            }
        }
        
        int[] ans = new int[stack.size()];
        for(int i = 0; i < ans.length; i++){
            ans[i] = stack.get(i);
        }

        return ans;
    }
}