class Solution {
   public static int maximumLengthSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int maxlen = 0;
        int left = 0;
        for(int right = 0; right < s.length(); right++){
            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0)+1);
            while(map.get(ch) > 2){
                char lch = s.charAt(left);
                map.put(lch, map.getOrDefault(lch,0) - 1);
                if(map.get(lch) == 0){
                    map.remove(lch);
                }
                left++;

            }

            maxlen = Math.max(maxlen, right - left + 1);
        }
        return maxlen;

    }
}