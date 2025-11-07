class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        for (int i=0; i<keyinput.length; i++) {
            if (keyinput[i].equals("right")) {
                if (Math.abs(answer[0]+1) <= board[0]/2) {
                    answer[0]++;   
                }
            }
            if (keyinput[i].equals("left")) {
                if (Math.abs(answer[0]-1) <=board[0]/2) {
                    answer[0]--;
                }
            }
            if (keyinput[i].equals("up")) {
                if (Math.abs(answer[1]+1) <=board[1]/2) {
                    answer[1]++;
                }
            }
            if (keyinput[i].equals("down")) {
                if (Math.abs(answer[1]-1) <=board[1]/2) {
                    answer[1]--;
                }
            }
        }
        
        
        return answer;
    }
}