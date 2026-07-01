class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int lsum = 0;
        int rsum = 0;
        int MaxSum = 0;

        for(int i = 0; i < k; i++){
            lsum = lsum + cardPoints[i];
        }
        MaxSum = lsum;
        int rightindex = n - 1;
        for(int i = k - 1; i >= 0; i--){
            lsum = lsum - cardPoints[i];
            rsum = rsum + cardPoints[rightindex];
            rightindex--;

            MaxSum = Math.max(MaxSum, lsum + rsum);
        }

        return MaxSum;

    }
}