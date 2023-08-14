import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
    BigInteger a1 = new BigInteger(num1);
    BigInteger a2 = new BigInteger(num2);
    BigInteger ans = a1.multiply(a2);
    String result = ans.toString();
    return result;
    }
}