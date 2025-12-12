import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        StringBuilder sb = new StringBuilder();        
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        
        if (m <= 2 && 2 <= n) sb.append(2).append('\n');
        if (m < 3) m = 3;
        if (m % 2 == 0) m++;

        for (int i = m; i <= n; i+=2) {
            if (isPrime(i)) {
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
    }
    
    static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n % 2 == 0) return n==2;
        if (n % 3 == 0) return n==3;
        
        for (int d = 5; d <= n / d; d += 6) {
            if (n % d == 0 || n % (d + 2) == 0) return false;
        }
        return true;
    }
}