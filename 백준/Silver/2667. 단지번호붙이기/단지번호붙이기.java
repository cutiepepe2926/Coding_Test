import java.io.*;
import java.util.*;

public class Main {

    static boolean[][] map;      // 지도 (집이면 true)
    static boolean[][] visited;  // 방문 여부
    static int dangi = 0;        // 단지 수
    static int cnt = 0;          // 현재 단지 집 수
    static ArrayList<Integer> house = new ArrayList<>();

    // 상, 하, 좌, 우
    static final int[] dx = {-1, 1, 0, 0};
    static final int[] dy = {0, 0, -1, 1};

    static void bfs(int x, int y, int n) {
        ArrayDeque<int[]> q = new ArrayDeque<>();
        q.add(new int[]{x, y});
        visited[x][y] = true;

        cnt = 1;     // 시작 집 포함
        dangi++;     // 단지 1개 추가

        while (!q.isEmpty()) {
            int[] u = q.poll();
            int ux = u[0], uy = u[1];

            for (int dir = 0; dir < 4; dir++) {
                int nx = ux + dx[dir];   // ux 기준
                int ny = uy + dy[dir];   // uy 기준

                if (nx < 0 || nx >= n || ny < 0 || ny >= n) continue;
                if (!map[nx][ny]) continue;
                if (visited[nx][ny]) continue;

                visited[nx][ny] = true;
                cnt++;
                q.add(new int[]{nx, ny});
            }
        }

        house.add(cnt);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        map = new boolean[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < n; j++) {
                map[i][j] = (line.charAt(j) == '1');
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] && !visited[i][j]) {
                    bfs(i, j, n);
                }
            }
        }

        Collections.sort(house);

        StringBuilder sb = new StringBuilder();
        sb.append(dangi).append('\n');
        for (int v : house) sb.append(v).append('\n');
        System.out.print(sb);
    }
}
