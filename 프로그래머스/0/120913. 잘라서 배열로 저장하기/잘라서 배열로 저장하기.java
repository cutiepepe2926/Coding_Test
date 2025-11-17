import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        // 나누어지면 그대로, 부족하면 +1 처리
        int len = (my_str.length()%n==0)? my_str.length()/n : my_str.length()/n + 1;
        String[] answer = new String[len];
        int start = 0;
        for (int i=0; i<answer.length; i++) { 
            StringBuilder sb = new StringBuilder();
            for (int j=0; j<n && start<my_str.length(); j++) {
                sb.append(my_str.charAt(start));
                start++;
            }
            answer[i] = sb.toString();
        }
        return answer;
    }
}