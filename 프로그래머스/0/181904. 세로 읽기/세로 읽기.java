class Solution {
    public String solution(String my_string, int m, int c) {
        char[][] list = new char[my_string.length()/m][m];
        
        int idx = 0;
        
        for (int i=0; i<my_string.length()/m; i++) {
            for (int j=0; j<m; j++) {
                list[i][j] = my_string.charAt(idx++);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int i=0; i<my_string.length()/m; i++) {
            sb.append(list[i][c-1]);
        }
        
        String answer = sb.toString();
        return answer;
    }
}