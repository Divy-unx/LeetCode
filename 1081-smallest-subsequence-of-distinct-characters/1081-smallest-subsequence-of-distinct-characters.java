class Solution {
    public String smallestSubsequence(String s) {
        Stack<Character> stack = new Stack<>();
        HashSet<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        int[] lastIndex = new int[26];
        for (int i = 0; i < s.length(); i++){
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if (set.contains(ch)){
                continue;
            }else{
                while(!stack.isEmpty() && stack.peek() > ch &&
                lastIndex[stack.peek() - 'a'] > i){
                    char removed = stack.pop();
                    set.remove(removed);
                }
            }
            stack.push(ch);
            set.add(ch);
        }
        for (char ch: stack){
            sb.append(ch);
        }
        return sb.toString();
    
    }
}