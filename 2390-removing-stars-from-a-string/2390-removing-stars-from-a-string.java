class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch != '*'){
                stack.push(ch);
            }else{
                stack.pop();
            }
        }

        for(char ch : stack){
            sb.append(ch);
        }

        return sb.toString();
    }
}