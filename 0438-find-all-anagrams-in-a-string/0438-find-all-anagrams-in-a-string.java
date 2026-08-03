class Solution {
    public static boolean compare(HashMap<Character , Integer> pMap , HashMap<Character , Integer> sMap){
        if(pMap.size() != sMap.size()){
            return false;
        }
        for(char ch : pMap.keySet()){
            Integer required = pMap.get(ch);
            Integer current = sMap.getOrDefault(ch,0);
            boolean same = required.equals(current);

            if(!same){
                return false;
            }
        }
        return true;
    }

    public static List<Integer> findAnagrams(String s , String p){
        HashMap<Character , Integer> sMap = new HashMap<>();
        HashMap<Character , Integer> pMap = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        if (p.length() > s.length()) {
            return new ArrayList<>();
        }

        for(int i = 0; i < p.length(); i++){
            char ch = p.charAt(i);
            pMap.put(ch , pMap.getOrDefault(ch,0) + 1);
        }

        for(int j = 0; j < p.length(); j++){
            char ch = s.charAt(j);
            sMap.put(ch, sMap.getOrDefault(ch , 0) + 1);
        }

        int i = p.length();

        while(i < s.length()){

            if(compare(pMap, sMap)) {
                list.add(i-p.length());
            }

            char cha = s.charAt(i);
            sMap.put(cha , sMap.getOrDefault(cha , 0) + 1);

            char chr = s.charAt(i - p.length());
            sMap.put(chr, sMap.getOrDefault(chr,0) - 1);
            if(sMap.get(chr) == 0){
                sMap.remove(chr);
            }

            i++;

        }

        if(compare(pMap, sMap)){
            list.add(i - p.length());
        }

        return list;

    }
}