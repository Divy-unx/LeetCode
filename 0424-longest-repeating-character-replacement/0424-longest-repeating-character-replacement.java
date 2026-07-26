class Solution {
    public int characterReplacement(String s, int k) {
         HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxFreq = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++){
            char rch  = s.charAt(right);
            map.put(rch, map.getOrDefault(rch, 0)+1);
            maxFreq = Math.max(maxFreq,map.get(rch));

            while((right-left+1) - maxFreq > k){
                char leftChar = s.charAt(left);
                map.put(leftChar,map.get(leftChar) - 1);

                if (map.get(leftChar) == 0){
                    map.remove(leftChar);
                }
                left++;

            }
            maxLen = Math.max(maxLen, right-left+1);
        }

        return maxLen;
    }
}