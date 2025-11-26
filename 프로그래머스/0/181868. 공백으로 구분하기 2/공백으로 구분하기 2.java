import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        StringTokenizer st = new StringTokenizer(my_string);
        LinkedList<String> ll = new LinkedList<>();
        
        while (st.hasMoreTokens()) {
            ll.add(st.nextToken());
        }
        
        String[] answer = new String[ll.size()];
        
        int i = 0;
        for (String s : ll) {
            answer[i++] = s;
        }
        
        return answer;
    }
}