class Solution {
    public long sumAndMultiply(int n) {
          if(n == 0){
            return 0;
        }
        
        StringBuilder sb = new StringBuilder();
        String str = String.valueOf(Math.abs(n));
        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch != '0'){
                sb.append(ch);
                sum += (ch - '0');
            }
        }
      
        long val = Long.parseLong(sb.toString());
        return val * sum;
    }
}