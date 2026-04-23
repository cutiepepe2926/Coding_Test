import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        
        int[] answer = new int[2];
        
        for (int i = 1; i <= yellow; i++) {
            
            if (yellow % i == 0) {
                int x = i;
                int y = yellow / i;
                
                if (2 * (x + y) + 4 == brown) {
                    if (x >= y) {
                        answer[0] = x + 2;
                        answer[1] = y + 2;
                    }
                }
            }
        }
        
        return answer;
        
    }
}
