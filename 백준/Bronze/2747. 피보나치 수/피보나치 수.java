import java.io.*;
import java.util.*;

public class Main {
    
    static int[] memo = new int[46];
    
    public static void main(String[] args) throws IOException {
        Arrays.fill(memo, -1);
        memo[0] = 0;
        memo[1] = 1;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(fibonacci(n));
    }
    
    static int fibonacci(int n) {
        if (memo[n]!=-1) return memo[n];
        return memo[n] = fibonacci(n-1) + fibonacci(n-2);
    }
}