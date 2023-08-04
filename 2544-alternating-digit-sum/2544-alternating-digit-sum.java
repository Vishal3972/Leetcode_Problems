class Solution {
    public int alternateDigitSum(int n) {
        int sum = 0;
        String s = Integer.toString(n);
        char sign = '+';
        if(s.length()%2 == 0){
            sign = '-';
        }
                
        while(n > 9){
            int temp = n%10;
            if(sign == '+'){
                sum += temp;
                sign = '-';
            }else{
                sum -= temp;
                sign = '+';
            }
            n/=10;
        }
        if(sign == '+'){
            sum += n;
        }else{
            sum -= n;
        }
        return sum;
    }
}