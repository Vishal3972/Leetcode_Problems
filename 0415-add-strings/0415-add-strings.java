import java.math.BigInteger;
class Solution {
    public String addStrings(String num1, String num2) {
        // int n1 = Integer.parseInt(num1);
        // int n2 = Integer.parseInt(num2);
        // int ans = n1+n2;
        // return Integer.toString(ans);
        
        BigInteger n1 = new BigInteger(num1);
        BigInteger n2 = new BigInteger(num2);
        BigInteger ans = n1.add(n2);
        return ans.toString();
    }
}