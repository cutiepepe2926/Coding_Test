import java.io.*;
import java.util.*;

public class Main {
    
    static int n;
    static int m;
    static int[] memo;
    static boolean[] used;
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
            
            // "작아지면" (오름차순 깨지면) 가지치기
            if (depth > 0 && i <= memo[depth - 1]) continue;
            
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
        memo = new int[m];
        used = new boolean[n + 1];
        
        dfs(0);
        
        System.out.print(sb);
        
    }
}