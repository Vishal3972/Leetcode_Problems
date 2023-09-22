class Solution {
    public static boolean judgeSquareSum(int c) {
        for (int a = 0; a <= Math.sqrt(c); a++) {
            int bSquared = c - a * a;
            int b = (int) Math.sqrt(bSquared);
            
            if (a * a + b * b == c) {
                return true;
            }
        }
        return false;
    }
}