import java.util.*;

class Solution {
    public String solution(String s) {
        String[] list = s.split("");
        Arrays.sort(list);
        StringBuilder sb = new StringBuilder();
        for (String l : list) {
            sb.append(l);
        }
        String answer = sb.reverse().toString();
        return answer;
    }
}