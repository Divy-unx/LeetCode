class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();

        int i = 0;
        int Switch = 1;

        while(i < target.length && Switch <= n){
            if(Switch == target[i]){
                list.add("Push");
                i++;

            }else{
                list.add("Push");
                list.add("Pop");
            }
            Switch++;
        }

        return list;
    }
}
