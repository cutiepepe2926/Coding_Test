class Solution {
    public int solution(int number, int limit, int power) {
        
        int answer = 1;
        
        for (int i = 1; i < number; i++) {
            
            int state = i + 1;
            
            int noLimitPower = 0;
            
            for (int d = 1; d <= state /d; d++) {
                if (state % d == 0) {
                    if (d == state/d) noLimitPower+=1;
                    else noLimitPower+=2;
                }
            }
            
            if (noLimitPower > limit) {
                noLimitPower = power;
            }
            
            answer += noLimitPower;
            
        }
        return answer;
    }
}