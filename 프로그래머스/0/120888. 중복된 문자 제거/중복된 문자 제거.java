import java.util.*;
class Solution {
    public String solution(String my_string) {
        
        StringBuilder sb = new StringBuilder();
        boolean dup = false;
        for (int i=0; i<my_string.length(); i++) {
            for (int j=0; j<sb.length(); j++) {
                if (my_string.charAt(i)==(sb.charAt(j))) {
                    dup = true;
                }
            }
            if (dup==true) {
                dup = false;
            }
            else {
                sb.append(my_string.charAt(i));
            }
        }
        
        String answer = sb.toString();
        return answer;
    }
}