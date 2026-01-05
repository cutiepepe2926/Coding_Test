import java.io.*;

public class Main {
    
    static int cntRecur = 0;
    static int cntDp = 0;
    static int[] dp;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 1;
        
        fib(n);
        fibonacci(n);
        
        StringBuilder sb = new StringBuilder();
        sb.append(cntRecur).append(" ").append(cntDp);
        System.out.println(sb);
    }
    
    static int fib(int n) {
        if (n==1 || n==2) {
            cntRecur++;
            return 1;
        }
        else return fib(n-1) + fib(n-2);
    }
    
    static int fibonacci(int n) {
        if (n<=2) return dp[n];
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
            cntDp++;
        }
        return dp[n];
    }
    
}