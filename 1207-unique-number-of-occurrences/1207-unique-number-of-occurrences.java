class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num , map.getOrDefault(num, 0) + 1);
        }

          HashSet<Integer> unique = new HashSet<>();
          for(int val : map.values()){
            if(unique.contains(val)){
                return false;
            }else{
                unique.add(val);
            }
          }

          return true;
    }
}