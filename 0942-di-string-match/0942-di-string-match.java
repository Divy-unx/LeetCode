class Solution {
    public int[] diStringMatch(String s) {
        int num = 0;
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == 'D'){
                stack.push(num);
                num++;
            }else{
                stack.push(num);
                num++;

                while(!stack.isEmpty()){
                    list.add(stack.pop());
                }
            }
        }

        stack.push(num);
        while(!stack.isEmpty()){
            list.add(stack.pop());
        }

        int[] ans = new int[list.size()];

        for(int i = 0; i < list.size(); i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}