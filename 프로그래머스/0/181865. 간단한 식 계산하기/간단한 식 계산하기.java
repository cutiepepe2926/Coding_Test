import java.util.*;

class Solution {
    public int solution(String binomial) {
        StringTokenizer st = new StringTokenizer(binomial);
        int answer = Integer.parseInt(st.nextToken());
        String op = st.nextToken();
        int b = Integer.parseInt(st.nextToken());
        if (op.equals("+")) {
            answer = answer + b;
        }
        else if (op.equals("-")) {
            answer = answer - b;
        }
        else {
            answer = answer * b;
        }
        return answer;
    }
}