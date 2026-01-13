import java.io.*;
import java.util.*;

public class Main {
    
    static List<Integer>[] graph;
    static boolean[] visited;
    
    static void bfs(int x) {
        visited[x] = true;
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.add(x);
        
        while (!q.isEmpty()) {
            int u = q.poll();
            
            for (int v : graph[u]) {
                if (!visited[v]) {
                    visited[v] = true;
                    q.add(v);
                }
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 정점
        int m = Integer.parseInt(br.readLine()); // 간선
        graph = new ArrayList[n+1];
        visited = new boolean[n+1];
        for (int i = 1; i <= n; i++) graph[i] = new ArrayList<>();
        
        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b); graph[b].add(a);
        }
        
        bfs(1);
        
        int answer = 0;
        
        for (int i = 1; i <= n; i++) {
            if (visited[i]) answer++;
        }
        
        System.out.println(answer-1);
        
    }
}