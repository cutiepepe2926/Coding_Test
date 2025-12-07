import java.util.*;

class Solution {
    
    public int solution(int n) {
        int answer = countPrime(n);
        return answer;
    }
    
    static int countPrime(int n) {
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        
        int cnt = 0;
        
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j+=i) {
                    isPrime[j] = false;
                }
            }
        }
        for (boolean p : isPrime) {
            if (p) cnt++;
        }
        return cnt;
    }
}