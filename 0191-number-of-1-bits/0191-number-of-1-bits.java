public class Solution {
    //n as an unsigned value
    public int hammingWeight(int n) {
       int cnt = 0;
        while (n != 0) {
            cnt += n & 1;
            n >>>= 1; // Shift n to the right by 1 bit
        }
        return cnt;
    }
}