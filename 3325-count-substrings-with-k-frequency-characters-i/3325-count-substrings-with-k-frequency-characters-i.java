class Solution {

    public boolean isValid(HashMap<Character , Integer> map , int k){
        for(int freq  : map.values()){
            if(freq >= k){
                return true;
            }
            
        }
        return false;
    }
    public int numberOfSubstrings(String s, int k) {
        int count = 0;
        int left = 0;

        HashMap<Character , Integer> map = new HashMap<>();
        for(int right = 0; right < s.length(); right++){
            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while(isValid(map, k)){
                count += s.length() - right;

                char leftch = s.charAt(left);
                map.put(leftch, map.getOrDefault(leftch, 0) - 1);

                if(map.get(leftch) == 0){
                    map.remove(left);
                }
                left++;
            }
            
        }
        return count;
    }
}