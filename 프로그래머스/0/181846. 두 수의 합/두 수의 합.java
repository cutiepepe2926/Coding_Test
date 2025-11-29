import java.math.*;

class Solution {
    public String solution(String a, String b) {
        BigInteger abi = new BigInteger(a);
        BigInteger bbi = new BigInteger(b);
        String answer = abi.add(bbi).toString();  
        return answer;
    }
}