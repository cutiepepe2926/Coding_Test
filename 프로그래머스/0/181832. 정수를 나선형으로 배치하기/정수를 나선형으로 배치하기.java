class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        int sero = 0;
        int garo = 0;
        int dir = 0;
        
        // 방향: 오른쪽, 아래, 왼쪽, 위
        int[] d_sero = {0, 1, 0, -1};
        int[] d_garo = {1, 0, -1, 0};
        
        for (int i = 1; i <= n*n; i++) {
            
            answer[sero][garo] = i;
            
            int ns = sero + d_sero[dir];
            int ng = garo + d_garo[dir];
            
            // 다음 칸이 범위 밖이거나 이미 채워졌으면 방향 전환
            if (ns < 0 || ns >= n || ng < 0 || ng >= n || answer[ns][ng] != 0) {
                dir = (dir + 1) % 4;
                ns = sero + d_sero[dir];
                ng = garo + d_garo[dir];
            }

            sero = ns;
            garo = ng;
            
        }
        
        return answer;
    }
}