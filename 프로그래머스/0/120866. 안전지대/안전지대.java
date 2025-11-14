import java.util.*;

class Solution {
    public int solution(int[][] board) {
        int answer =0;
        int n = board.length;
        boolean[][] b = new boolean[n][n];
        LinkedList<int[]> list = new LinkedList<>();
        // s는 세로, g는 가로
        for (int s=0; s<n; s++) {
            for (int g=0; g<n; g++) {
                if (board[s][g]==1) {
                    int[] bomb = {s,g};
                    list.add(bomb);
                }
            }
        }
        
        //s는 세로 bomb[0], g는 가로 bomb[1]
        for (int[] bomb : list) {
            int s_s = 0;
            int s_e = 0;
            int g_s = 0;
            int g_e = 0;
            if (bomb[0]-1 < 0) {
                s_s = 0;
            }
            else {
                s_s = bomb[0]-1;
            }
            
            if (bomb[0]+1 > n-1) {
                s_e = n-1;
            }
            else {
                s_e = bomb[0]+1;
            }
            if (bomb[1]-1 < 0) {
                g_s = 0;
            }
            else {
                g_s = bomb[1]-1;
            }
            if (bomb[1]+1 > n-1) {
                g_e = n-1;
            }
            else {
                g_e = bomb[1]+1;
            }
            for (int i=s_s; i<=s_e; i++) {
                for (int j=g_s; j<=g_e; j++) {
                    b[i][j] = true;
                }
            }
        }
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (b[i][j]==false) {
                    answer++;
                }
            }
        }
        
        
        
        return answer;
    }
}