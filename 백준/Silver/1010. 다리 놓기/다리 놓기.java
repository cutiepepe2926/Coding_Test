import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for (int j = 0; j < t; j++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            n = Math.min(n, m-n);
            
            long ans = 1;
            for (int i = 1; i <= n; i++) {
                ans = ans * (m - i + 1) / i;
            }
            sb.append(ans).append("\n");
        }
        
        System.out.println(sb);
    }
}