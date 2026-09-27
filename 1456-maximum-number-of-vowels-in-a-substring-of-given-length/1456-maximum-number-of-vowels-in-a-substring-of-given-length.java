class Solution {
    public static boolean isVowel(char ch){
       return ch == 'a'
        || ch == 'e' 
        || ch == 'i' 
        || ch == 'o' 
        || ch == 'u';
    }
    public static int maxVowels(String s, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        int maxCount = 0;

        while(j < s.length()){
            if (isVowel(s.charAt(j))){
                count++;
            }
            if (j - i + 1 == k){
                maxCount = Math.max(maxCount,count);
                if (isVowel(s.charAt(i))){
                    count--;
                }
                i++;
            }
            j++;
        }
        return maxCount;
    }
}