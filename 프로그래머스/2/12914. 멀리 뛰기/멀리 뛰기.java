class Solution {
    public long solution(int n) {
        
        if (n == 1) return 1;
        if (n == 2) return 2;
        
        long a = 1; //dp[1]
        long b = 2; //dp[2]
        long c = 0;
        
        for (int i = 3; i <= n; i++) {
            c = (a + b) % 1234567;
            a = b;
            b = c;
        }
        
        return c;
    }
}