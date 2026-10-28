class Solution {
    public int buyChoco(int[] prices, int money) {
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int price : prices) {
            if (price < min) {
                min2 = min;
                min = price;
            }else{
                min2 = Math.min(min2,price);
            }
        }
        int overall = min + min2;
        if( overall <= money){
            return money - overall;
        }else{
            return money;
        }
    }
}