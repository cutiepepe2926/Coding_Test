class Solution {
    public int solution(int n) {
        
        int answer = 1;
        
        for (int i = 1; i < n; i++) {
            
            int total = 0;
            
            for (int j = i; j < n; j++) {
                
                total += j;
                
                if (total > n) {
                    break;
                }
                else if (total == n) {
                    answer++;
                    break;
                }
                else {
                    
                }
                
            }
            
        }
        
        return answer;
    }
}