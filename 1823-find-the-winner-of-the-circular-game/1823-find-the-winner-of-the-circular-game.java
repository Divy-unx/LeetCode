class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            list.add(i);
        }

        int idx = 0;
        while(list.size() > 1){
            int rm = (idx + k - 1) % list.size();
            list.remove(rm);
            idx = rm;
        }

        return list.get(0);
    }
}