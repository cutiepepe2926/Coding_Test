import java.util.*;

class Solution {
    
    static int[][] map;
    static int n;
    static int m;
    static int[] dx = new int[]{1,-1,0,0};
    static int[] dy = new int[]{0,0,-1,1};
    static void bfs(int x, int y) {
        ArrayDeque<int[]> q = new ArrayDeque<>();
        q.add(new int[]{x,y});
        
        while(!q.isEmpty()) {
            int[] cur = q.poll();
            int cx = cur[0];
            int cy = cur[1];
            for (int dir = 0; dir < 4; dir++) {
                int nx = cx + dx[dir];
                int ny = cy + dy[dir];
                
                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue; //탈주
                if (map[nx][ny] == 0 || map[nx][ny] > 1) continue; // 벽 or 방문
                map[nx][ny] = map[cx][cy] + 1;
                q.add(new int[]{nx,ny});
            }
        }
    }
    
    public int solution(int[][] maps) {
        map = maps;
        n = maps.length;
        m = maps[0].length;
        bfs(0,0);
        return (map[n-1][m-1]==1)?-1:map[n-1][m-1];
    }
}