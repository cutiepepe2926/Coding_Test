import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < t; i++) {
            long num = Long.parseLong(br.readLine());
            
            if (num < 2) {
                sb.append(2).append('\n');
                continue;
            }

            while (!isPrime(num)) num++;
            sb.append(num).append("\n");
        }
        System.out.println(sb);
    }
    
    static boolean isPrime(long n) {
        if (n < 2) return false;
        if (n % 2 == 0) return n == 2;
        if (n % 3 == 0) return n == 3;

        for (long d = 5; d <= n / d; d += 6) {
            if (n % d == 0 || n % (d + 2) == 0) return false;
        }
        return true;
    }
}