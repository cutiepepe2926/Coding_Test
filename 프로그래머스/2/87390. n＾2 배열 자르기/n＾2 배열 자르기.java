class Solution {
    public int[] solution(int n, long left, long right) {
        
        long len = right - left + 1;
        
        int[] answer = new int[(int)len];
        
        int idx = 0;
        
        long si = left / n; // start i
        long sj = left % n; // start j
        long ei = right / n; // end i
        long ej = right % n; // end j
        
        if (si == ei) {
            for (long j = sj; j <= ej; j++) {
                if (j <= si) answer[idx++] = (int)(si + 1);
                else answer[idx++] = (int)(j + 1);
            }
            
            return answer;
        }
        
        // sero
        for (long i = si; i <= ei; i++) {
            
            // garo
            if (i == si) { // start line
                for (long j = sj; j < n; j++) { // 특정 시작지점부터 n까지
                    if (j <= i) answer[idx++] = (int)(i + 1);
                    else answer[idx++] = (int)(j + 1);
                }
            }
            
            else if (i == ei) { // end line
                for (long j = 0; j <= ej; j++) { // 처음부터 끝지점(ej)까지
                    if (j <= i) answer[idx++] = (int)(i + 1);
                    else answer[idx++] = (int)(j + 1);
                }
            }
            
            else { // 한 줄 통째로
                for (long j = 0; j < n; j++) {
                    if (j <= i) answer[idx++] = (int)(i + 1);
                    else answer[idx++] = (int)(j + 1);
                }
                
            }
        }
        
        return answer;
    }
}