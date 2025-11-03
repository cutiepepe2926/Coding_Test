import java.util.*;

class Solution {
    public String solution(int age) {
        
        int length = String.valueOf(age).length();
        String s_age = String.valueOf(age);
        StringBuilder sb = new StringBuilder();
        
        for (int i=0; i<length; i++) {
            sb.append((char)(97+(s_age.charAt(i)-'0')));
        }
        
        String answer = sb.toString();
        return answer;
    }
}