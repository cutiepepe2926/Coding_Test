import java.util.*;

class Solution {
    public int[] solution(String myString) {
        String[] s_list = myString.split("x");
        
        int[] answer = new int[s_list.length];
        
        int idx = 0;
        
        for (String s : s_list) {
            answer[idx++] = s.length();
        }
        
        if (myString.endsWith("x")) {
            answer = Arrays.copyOfRange(answer,0,answer.length+1);
        }
        
        return answer;
    }
}