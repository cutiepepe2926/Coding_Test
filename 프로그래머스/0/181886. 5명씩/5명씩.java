import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        
        LinkedList<String> ll = new LinkedList<>();
        
        for (int i=0; i<names.length; i+=5) {
            ll.add(names[i]);
        }
        
        String[] answer = new String[ll.size()];
        int i = 0;
        for (String s : ll) {
            answer[i++] = s;
        }
        return answer;
    }
}