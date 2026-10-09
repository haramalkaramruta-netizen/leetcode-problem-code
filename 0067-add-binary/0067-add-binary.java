import java.math.BigInteger;

class Solution {
    public String addBinary(String a, String b) {
        // 1. Convert binary strings into BigInteger numbers
        BigInteger num1 = new BigInteger(a, 2); 
        BigInteger num2 = new BigInteger(b, 2);
        
        // 2. Add the numbers together and convert the sum back to a binary string
        return num1.add(num2).toString(2); 
    }
}
