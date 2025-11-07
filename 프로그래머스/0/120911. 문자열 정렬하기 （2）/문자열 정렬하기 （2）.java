import java.util.*;

class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        String[] s = my_string.toLowerCase().split("");
        Arrays.sort(s);
        for (String i : s) {
            sb.append(i);
        }
        String answer = sb.toString();
        return answer;
    }
}