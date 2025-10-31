import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        String si = Integer.toString(n);
        String[] s = si.split(""); 
        for (int i=0; i<s.length; i++) {
            answer += Integer.parseInt(s[i]);
        }
        
        return answer;
    }
}