import java.io.*;
import java.util.*;

public class Main {

    // 정점의 수가 최대 100,000인 경우 배열로 그래프 구현 시 메모리 초과 가능성 존재
    // 인접 리스트로 구현
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();
    static int[] order;
    static int cnt = 1;

    // dfs (깊이 우선 탐색)
    static void dfs(int start) {
        visited[start] = true;
        order[start] = cnt++;

        for (int x : graph[start]) {
            if (!visited[x]) {
                dfs(x);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 정점
        int m = Integer.parseInt(st.nextToken()); // 간선
        int r = Integer.parseInt(st.nextToken()); // 시작점

        // 그래프 배열 및 방문 확인 배열 생성
        graph = new ArrayList[n+1];
        visited = new boolean[n+1];

        // 방문 순서 배열 생성
        order = new int[n+1];

        // 그래프 배열 초기화 (안해주면 NullPointException 발생)
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        // 간선 수 만큼 연결
        for (int i = 0; i < m; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            int u = Integer.parseInt(st2.nextToken());
            int v = Integer.parseInt(st2.nextToken());

            // 그래프에 연결점 추가
            graph[u].add(v); graph[v].add(u);

        }

        // 정점 번호가 작은 것부터 방문하기 위한 정렬
        for (int i = 1; i <= n; i++) {
            Collections.sort(graph[i]);
        }

        // dfs 탐색
        dfs(r);

        // 방문한 순서대로 출력
        for (int i = 1; i <= n; i++) {
            sb.append(order[i]).append('\n');
        }
        System.out.print(sb);
    }
}