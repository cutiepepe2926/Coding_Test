import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        
        LinkedList<String> ll = new LinkedList<>();        
        
        for (String s : picture) {
            
            StringBuilder sb = new StringBuilder();
            
            for (int j = 0; j < s.length(); j++) {
                
                sb.append(String.valueOf(s.charAt(j)).repeat(k));
                
            }
            
            for (int i=0; i<k; i++) {
                ll.add(sb.toString());
            }
            
        }
        
        int i = 0;
        
        String[] answer = new String[ll.size()];
        
        for (String s : ll) {
            answer[i++] = s;
        }

        return answer;
    }
}