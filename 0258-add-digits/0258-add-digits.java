class Solution {
    public int addDigits(int num) {
        
        while(num > 9){
            int ans = 0;
             while(num > 9){
                ans += num%10;
                num /= 10;
            }
            ans += num;
            num = ans;
        }
        return num;
    }
}