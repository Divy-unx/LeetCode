class Solution {
    public int precedence(char op){
        if(op == '+'){
            return 1;
        }

        else if(op == '-'){
            return 1;
        }

        else if(op == '*'){
            return 2;
        }

        else{
            return 2;
        }
    }

    public int operation(int v1, int v2, char op){
        if(op == '+'){
            return v1 + v2;
        }

        else if(op == '-'){
            return v1 - v2;
        }

        else if(op == '*'){
            return v1 * v2;
        }

        else {
            return v1 / v2;
        }
    }

    public int calculate(String s) {
        Stack<Integer> operand = new Stack<>();
        Stack<Character> operator = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == ' '){
                continue;
            }

            else if(Character.isDigit(ch)){
                int num = 0;

                while(i < s.length() && Character.isDigit(s.charAt(i))){
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                operand.push(num);
                i--;
            }

            else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                while(!operator.isEmpty() &&
                    precedence(ch) <= precedence(operator.peek())){

                        char op = operator.pop();
                        int v2 = operand.pop();
                        int v1 = operand.pop();
                        operand.push(operation(v1,v2,op));

                }

                operator.push(ch);

            }

        }
        while(!operator.isEmpty()){
            char op = operator.pop();
            int v2 = operand.pop();
            int v1 = operand.pop();
            operand.push(operation(v1,v2,op));
        }

        return operand.peek(); 
    }
}