class Solution {
    public int[] solution(int[][] score) {
        int [] temp = new int[score.length];
        int[] answer = new int[score.length];
        
        for (int s=0; s<score.length; s++) {
            temp[s] = (score[s][0]+score[s][1]);
        }
        
        int rank = 1;
        for (int i=200; i>=0; i-=1) {
            boolean check = false;
            int dup = 0;
            for (int idx = 0; idx<score.length; idx++) {
                if (temp[idx]==i) {
                    answer[idx] = rank;
                    dup++;
                    check  = true;
                }
            }
            if (check) {
                rank = rank + dup;
            }
            
        }
        
        return answer;
    }
}