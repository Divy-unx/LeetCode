class Solution {
    public void swap(char[] arr, int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void reverse(char[] arr, int start, int end){
        while(start < end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
    public int nextGreaterElement(int n) {
        char[] digits = String.valueOf(n).toCharArray();
        int pivot = -1;
        for(int i = digits.length - 1; i > 0; i--){
            if(digits[i-1] < digits[i]){
                pivot = i - 1;
                break;
            }
        }

        if(pivot != -1){
            int swap_index = pivot;
            for(int j = digits.length - 1; j >= 0; j--){
                if(digits[j] > digits[pivot]){
                    swap_index = j;
                    break;
                }
            }

            swap(digits, pivot, swap_index);
        }
        reverse(digits, pivot + 1, digits.length - 1);

        if(pivot == -1){
            return -1;
        }

        long ans = Long.parseLong(new String(digits));
        if(ans > Integer.MAX_VALUE){
            return -1;
        }

        return (int) ans;
    }
}