class Solution {
    public String solution(String bin1, String bin2) {
        int a = Integer.parseInt(bin1, 2);  // 2진수 문자열 → 10진수 int
        int b = Integer.parseInt(bin2, 2);
        int sum = a + b;
        return Integer.toBinaryString(sum); 
    }
}