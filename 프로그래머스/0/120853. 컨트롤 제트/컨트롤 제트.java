import java.util.*;
class Solution {
    public int solution(String s) {
        String[] sarr = s.split(" ");
        int prev = 0;
        int answer = 0;
        for (int i=0; i<sarr.length; i++) {
            if (!sarr[i].equals("Z")) {
                answer += Integer.parseInt(sarr[i]);
                prev = Integer.parseInt(sarr[i]);
            }
            else {
                answer -= prev;
            }
        }
        return answer;
    }
}