import java.io.*;
import java.util.*;

public class Main {
    
    static int targetX;
    static int targetY;
    static int[] dx = new int[]{-1, 1, 0, 0};
    static int[] dy = new int[]{0, 0, -1, 1};
    static boolean[][] maze;
    static boolean[][] visited;
    
    static int[][] dist; // 거리 저장용 배열
    
    static void bfs(int i, int j) {
        visited[i][j] = true;
        ArrayDeque<int[]> q = new ArrayDeque<>();
        q.add(new int[]{i,j});
        dist[i][j] = 1; // 시작 칸 포함
        
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];
            
            if (x == targetX - 1 && y == targetY - 1) {
                System.out.println(dist[x][y]);
                return;
            }
            
            for (int dir = 0; dir < 4; dir++) {
                int nx = x + dx[dir];
                int ny = y + dy[dir];
                
                if (nx < 0 || nx >= targetX || ny < 0 || ny >= targetY) continue;
                if (!maze[nx][ny] || visited[nx][ny]) continue;
                
                visited[nx][ny] = true;
                dist[nx][ny] = dist[x][y] + 1;
                q.add(new int[]{nx, ny});
             }
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        targetX = Integer.parseInt(st.nextToken());
        targetY = Integer.parseInt(st.nextToken());
        
        // 초기 셋팅
        maze = new boolean[targetX][targetY];
        visited = new boolean[targetX][targetY];
        dist = new int[targetX][targetY];
        for (int i = 0; i < targetX; i++) {
            String line  = br.readLine();
            for (int j = 0; j < targetY; j++) {
                if (line.charAt(j) == '1') maze[i][j] = true;
            }
        }
        
        bfs(0,0);
    }
}