import java.io.*;
import java.util.*;

public class Main {
    
    static int n;
    static int m;
    static boolean[] used;
    static int[] memo;
    static StringBuilder sb = new StringBuilder();
    static void dfs(int depth) {
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                sb.append(memo[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        
        for (int i = 1; i <= n; i++) {
            if (used[i]) continue;
            
            used[i] = true;
            memo[depth] = i;
            
            dfs(depth + 1);
            
            used[i] = false;
        }
        
        
        
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        used = new boolean[n+1];
        memo = new int[m];
        
        dfs(0);
        
        System.out.print(sb);
    }
}