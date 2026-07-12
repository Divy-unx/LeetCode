class Solution {
    public String smallestNumber(String pattern) {
        int num = 1;
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        for(char ch : pattern.toCharArray()){
            if(ch == 'D'){
                stack.push(num);
                num++;
            }else{
                stack.push(num);
                num++;
                while(!stack.isEmpty()){
                    sb.append(stack.pop());
                }
            }
        }
        stack.push(num);
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();

    }
}