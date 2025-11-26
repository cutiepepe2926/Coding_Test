import java.util.*;
class Solution {
    public String[] solution(String[] strArr) {
        LinkedList<String> ll = new LinkedList<>();
        
        for (String str : strArr) {
            if (str.contains("ad")) {
                continue;
            }
            ll.add(str);
        }
        
        String[] answer = new String[ll.size()];
        
        int i = 0;
        
        for (String s : ll) {
            answer[i++] = s;
        }
        
        return answer;
    }
}