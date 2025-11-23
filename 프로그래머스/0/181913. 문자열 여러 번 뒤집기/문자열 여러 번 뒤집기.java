import java.util.*;

class Solution {
    public String solution(String my_string, int[][] queries) {
        
        StringBuilder sb = new StringBuilder();
        sb.append(my_string);
        
        for (int i=0; i<queries.length; i++) {
            
            int s = queries[i][0];
            int e = queries[i][1];

            StringBuilder replace = new StringBuilder();
            replace.append(sb.substring(s,e+1));
            replace.reverse();
            sb.replace(s,e+1, replace.toString());
            
        }
        
        String answer = sb.toString();
        
        return answer;
    }
}