import java.io.*;
import java.util.*;

public class Main {
    
    // 선언
    static List<Integer>[] graph;
    static boolean[] visited;
    static int[] order;
    static int cnt;
    
    static void bfs(int x) {
        visited[x] = true;
        order[x] = cnt++;
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.add(x);
        
        while (!q.isEmpty()) {
            int u = q.poll();
            for (int v : graph[u]) {
                if (!visited[v]) {
                    visited[v] = true;
                    order[v] = cnt++;
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
        graph = new ArrayList[n+1];
        visited = new boolean[n+1];
        order = new int[n+1];
        cnt = 1;
        for (int i = 1; i <= n; i++) graph[i] = new ArrayList<>();
        
        for (int i = 0; i < m; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());
            graph[a].add(b); graph[b].add(a);
        }
        
        for (int i = 1; i <= n; i++) Collections.sort(graph[i], Collections.reverseOrder());
        
        bfs(r);
        
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(order[i]).append("\n");
        }
        System.out.print(sb);
        
    }
}