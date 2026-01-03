import java.io.*;
import java.util.*;

public class Main {
    
    static int[] memo = new int[46];
    
    public static void main(String[] args) throws IOException {
        Arrays.fill(memo, -1);
        memo[0] = 0;
        memo[1] = 1;
        memo[2] = 1;
        memo[3] = 2;
        memo[4] = 3;
        memo[5] = 5;
        memo[6] = 8;
        memo[7] = 13;
        memo[8] = 21;
        memo[9] = 34;
        memo[10] = 55;
        memo[11] = 89;
        memo[12] = 144;
        memo[13] = 233;
        memo[14] = 377;
        memo[15] = 610;
        memo[16] = 987;
        memo[17] = 1597;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(fibonacci(n));
    }
    
    static int fibonacci(int n) {
        if (memo[n]!=-1) return memo[n];
        return memo[n] = fibonacci(n-1) + fibonacci(n-2);
    }
}