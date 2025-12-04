class Solution {
    public int solution(String s) {
        
        int answer = 0;
        char x = s.charAt(0);
        int x_num = 0;
        int non_x_num = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == x) {
                x_num++;
            }   
            else {
                non_x_num++;
            }
            if (x_num == non_x_num) {
                answer++;
                x_num = 0;
                non_x_num = 0;
                if (i+1 < s.length()) {
                    x = s.charAt(i+1);
                }
            }
            else {
                if (i+1 >= s.length()) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}