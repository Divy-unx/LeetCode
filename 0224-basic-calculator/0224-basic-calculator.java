import java.util.Stack;

class Solution {

    public int precedence(char op) {
        return 1; // + and - have same precedence
    }

    public int operation(int v1, int v2, char op) {
        if (op == '+') {
            return v1 + v2;
        } else {
            return v1 - v2;
        }
    }

    public int calculate(String s) {

        Stack<Integer> operand = new Stack<>();
        Stack<Character> operator = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == ' ') {
                continue;
            }

            if (ch == '(') {
                operator.push(ch);
            }

            else if (Character.isDigit(ch)) {

                int num = 0;

                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }

                operand.push(num);
                i--;
            }

            else if (ch == '+' || ch == '-') {

                
                if (ch == '-') {

                    int j = i - 1;

                    while (j >= 0 && s.charAt(j) == ' ') {
                        j--;
                    }

                    if (j < 0 || s.charAt(j) == '(') {
                        operand.push(0);
                    }
                }

                while (!operator.isEmpty()
                        && operator.peek() != '('
                        && precedence(ch) <= precedence(operator.peek())) {

                    char op = operator.pop();

                    int v2 = operand.pop();
                    int v1 = operand.pop();

                    operand.push(operation(v1, v2, op));
                }

                operator.push(ch);
            }

            else if (ch == ')') {

                while (operator.peek() != '(') {

                    char op = operator.pop();

                    int v2 = operand.pop();
                    int v1 = operand.pop();

                    operand.push(operation(v1, v2, op));
                }

                operator.pop();
            }
        }

        while (!operator.isEmpty()) {

            char op = operator.pop();

            int v2 = operand.pop();
            int v1 = operand.pop();

            operand.push(operation(v1, v2, op));
        }

        return operand.peek();
    }
}