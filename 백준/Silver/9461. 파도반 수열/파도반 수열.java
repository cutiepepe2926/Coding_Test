import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        dp = new long[101];
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;
        dp[4] = 2;
        dp[5] = 2;
        dp[6] = 3;

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            sb.append(sail(n)).append("\n");
        }
        System.out.println(sb);
    }

    static long[] dp;

    static long sail(int n) {
        if (n >= 0 && n < 7) return dp[n];
        if (dp[n]!=0) return dp[n];
        return dp[n] = sail(n-1) + sail(n-5);
    }
}