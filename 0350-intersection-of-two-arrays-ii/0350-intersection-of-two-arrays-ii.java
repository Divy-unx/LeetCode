class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int num1 : nums1){
            map.put(num1, map.getOrDefault(num1, 0) + 1);
        }

        for(int num2 : nums2){
            Integer freq = map.get(num2);
            if(map.containsKey(num2) && freq > 0){
                list.add(num2);
                map.put(num2, freq - 1);
                
            }
        }

        int[] result = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            result[i] = list.get(i);
        }

        return result;
    }
}