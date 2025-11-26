class Solution {
    public int solution(double flo) {
        String[] s = String.valueOf(flo).split("\\.",2);
        return Integer.parseInt(s[0]);
    }
}