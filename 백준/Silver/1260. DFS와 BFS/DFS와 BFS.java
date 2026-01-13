import java.io.*;
import java.util.*;

public class Main {
    
    // 초기 선언
    static List<Integer>[] graph;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();
    
    // DFS
    static void dfs(int x) {
        visited[x] = true;
        sb.append(x).append(" ");
        
        for (int v : graph[x]) {
            if (!visited[v]) {
                dfs(v);
            }
        }
    }
    
    // BFS
    static void bfs(int x) {
        Arrays.fill(visited,false);
        visited[x] = true;
        sb.append(x).append(" ");
        
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.add(x);
        
        while (!q.isEmpty()) {
            int u = q.poll();
            for (int v : graph[u]) {
                if (!visited[v]) {
                    visited[v] = true;
                    sb.append(v).append(" ");
                    q.add(v);
                }
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 정점
        int m = Integer.parseInt(st.nextToken()); // 간선
        int r = Integer.parseInt(st.nextToken()); // 시작점
        
        // 초기화
        graph = new ArrayList[n+1];
        visited = new boolean[n+1];
        for (int i = 1; i <= n; i++) graph[i] = new ArrayList<>();
        
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b); graph[b].add(a);
        }
        
        // 방문순서 오름차순 정렬
        for (int i = 1; i <= n; i++) Collections.sort(graph[i]);
        
        dfs(r);
        sb.append("\n");
        bfs(r);
        
        System.out.print(sb);
        
    }
}