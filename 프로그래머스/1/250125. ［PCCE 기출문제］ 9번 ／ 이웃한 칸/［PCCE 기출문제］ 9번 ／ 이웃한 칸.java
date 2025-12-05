class Solution {
    public int solution(String[][] board, int h, int w) {
        int n = board.length;
        int answer = 0;
        
        String color = board[h][w];
        
        if (h+1 < n && board[h+1][w].equals(color)) {
            answer++;
        }
        
        if (h-1 >= 0 && board[h-1][w].equals(color)) {
            answer++;
        }
        
        if (w+1 < n && board[h][w+1].equals(color)) {
            answer++;
        }
        
        if (w-1 >= 0 && board[h][w-1].equals(color)) {
            answer++;
        }
        
        return answer;
    }
}