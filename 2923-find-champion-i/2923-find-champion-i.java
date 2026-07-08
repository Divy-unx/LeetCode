class Solution {
    public int findChampion(int[][] grid) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i<grid.length; i++){
            stack.push(i);
        }
        // Teams Eliminated
        while(stack.size() >= 2){
            int i = stack.pop();
            int j = stack.pop();
            
            if(grid[i][j] == 1){
                stack.push(i);
            }else{
                stack.push(j);
            }
        }
        // Verify the Potential team if it's a champion ot not

        int pot = stack.pop();
        for(int i = 0; i < grid.length; i++){
            if(i != pot && grid[pot][i] == 0){
                return -1;
            }
        }
        return pot;

    }
}