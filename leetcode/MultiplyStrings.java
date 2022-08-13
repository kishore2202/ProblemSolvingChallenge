import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
        BigInteger b=new BigInteger(num1);
        BigInteger b1=new BigInteger(num2);
        BigInteger mul=b.multiply(b1);
        String str=String.valueOf(mul);
        return str;
    }
}
