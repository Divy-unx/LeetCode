class Solution {
    public int[][] generateMatrix(int n) {
        int [][] nums = new int[n][n];
        int minR = 0;
        int maxR = nums.length - 1;
        int minC = 0;
        int maxC = nums[0].length - 1;
        int total = n*n;
        int count = 1;

        while(count <= total){
            //top wall
            for(int i = minR, j = minC; j <= maxC; j++ ){
                nums[i][j] = count;
                count++;
            }
            minR++;

            //right wall
            for(int i = minR, j = maxC; i <= maxR; i++ ){
                nums[i][j] = count;
                count++;
            }
            maxC--;

            //bottom wall

            for(int i = maxR, j = maxC; j >= minC ; j-- ){
                nums[i][j] = count;
                count++;
            }
            maxR--;

            //left wall
            for(int i = maxR, j = minC; i >= minR; i-- ){
                nums[i][j] = count;
                count++;
            }
            minC++;
        }

        return nums;
    }
}