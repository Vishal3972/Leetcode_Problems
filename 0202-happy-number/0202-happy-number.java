// import java.lang.Math;`
class Solution {
    public boolean isHappy(int n) { 
        if(n==1){
            return true;
        }              
        while (n!=1 && n!=4) {
            int sum = 0;
            while (n > 0) {
                int temp = n % 10;
                sum += Math.pow(temp, 2);
                n /= 10;
            }
            if (sum == 1) {
                return true;
            }
            n = sum;
        }
        return false;
        }
}