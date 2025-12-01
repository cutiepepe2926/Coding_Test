class Solution {
    public int solution(String t, String p) {
        
        int answer = 0;
        long num_p = Long.parseLong(p);
        long num_t = 0;
        
        for (int i = 0; i < t.length(); i++) {
            if (i+p.length() > t.length()) {
                break;
            }
            num_t = Long.parseLong(t.substring(i,i+p.length()));
            if (num_t <= num_p) {
                answer++;
            }
        }
    
        return answer;
    }
}