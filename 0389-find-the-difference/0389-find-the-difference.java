class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for(char ch : t.toCharArray()){
            Integer freq = map.get(ch);
            if(freq != null && freq > 0){
                map.put(ch, freq - 1);
            }else{
                return ch;
            }
        }
        return ' ';
 
    }
}