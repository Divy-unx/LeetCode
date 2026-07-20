class Solution {
    public void reverse(int[][] grid, int low, int high){
        int row = grid.length;
        int col = grid[0].length;

        while(low < high){
            int temp = grid[low / col][low % col];
            grid[low / col][low % col] = grid[high / col][high % col];
            grid[high / col][high % col] = temp;

            low++;
            high--;
        }
    }
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = grid.length * grid[0].length;

        k = k % n;

        if(k < 0){
            k = k + n;
        }

        reverse(grid, 0 , n-k-1);
        reverse(grid, n-k, n-1);
        reverse(grid, 0, n-1);

        for(int i = 0; i < grid.length; i++){
            List<Integer> row = new ArrayList<>();

            for(int j = 0; j < grid[0].length; j++){
                row.add(grid[i][j]);
            }

            ans.add(row);
        }

        return ans;


    }
}