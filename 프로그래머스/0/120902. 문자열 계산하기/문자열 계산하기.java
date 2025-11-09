import java.util.*;

class Solution {
    public int solution(String my_string) {
        String[] s = my_string.split(" ");
        int answer = 0;
        String check = "";
        for (int i=0; i<s.length; i++) {
            if (i==0) {
                answer += Integer.parseInt(s[i]);
                continue;
            }
            if (s[i].equals("+")){
                check = "+";
            }
            else if (s[i].equals("-")) {
                check = "-";
            }
            else {
                if (check.equals("+")) {
                    answer += Integer.parseInt(s[i]);    
                }
                else {
                    answer -= Integer.parseInt(s[i]);
                }
            }
        }
        
        return answer;
    }
}