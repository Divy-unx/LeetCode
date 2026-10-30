class Solution {
     public static int[][] setZeroes(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return matrix;
        }

        int[] row = new int[matrix.length];
        int[] col = new int[matrix[0].length];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                if (matrix[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                if (row[i] == 1 || col[j] == 1){
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }
}