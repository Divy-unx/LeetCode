class Solution {
    public String removeKdigits(String num, int k) {
        if(num.length() == k){
            return "0";
        }

        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(Character ch : num.toCharArray()){
            while(!stack.isEmpty() && k > 0 && ch < stack.peek()){
                stack.pop();
                k--;
            }

            stack.push(ch);
        }

        while(k > 0){
            stack.pop();
            k--;
        }

        for(int i = 0; i < stack.size(); i++){
            if(!sb.isEmpty() && sb.charAt(0) == '0'){
                sb.deleteCharAt(0);
            }

            sb.append(stack.elementAt(i));
        }

        return sb.toString();
    }
}