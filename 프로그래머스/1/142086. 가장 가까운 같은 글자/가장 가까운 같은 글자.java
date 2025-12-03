import java.util.*;

class Solution {
    public int[] solution(String s) {
        
        int[] answer = new int[s.length()];
        
        String[] list = s.split("");
        
        Arrays.fill(answer, -1);
        
        for (int i = 1; i < s.length(); i++) {
            
            int j = i - 1;
            
            while (j>=0) {
                if (s.charAt(i) == s.charAt(j)) {
                    answer[i] = i - j;
                    break;
                }
                j--;
            }
        }
        
        return answer;
    }
}