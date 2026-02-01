import java.util.*;

class Solution {
    public String solution(String s) {
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            
            if ( i-1 >= 0 && s.charAt(i-1) == ' ' && s.charAt(i) != ' ' || i==0 ) {
                sb.append(String.valueOf(s.charAt(i)).toUpperCase());
            }
            else sb.append(String.valueOf(s.charAt(i)).toLowerCase());
        }
        
        return sb.toString();
    }
}