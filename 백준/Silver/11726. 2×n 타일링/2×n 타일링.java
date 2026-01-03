import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp = new int[Math.max(3, n + 1)];;
        Arrays.fill(dp,-1);
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        System.out.println(calc(n)%10007);
    }
    
    static int[] dp;
    
    static int calc(int n) {
        if (n==1) return 1;
        if (n==2) return 2;
        if (dp[n]!=-1) return dp[n];
        dp[n] = (calc(n - 1) + calc(n - 2)) % 10007;
        return dp[n];
    }
    
}