import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        
        ArrayList<String> al = new ArrayList<>();
        
        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) {
                al.add(todo_list[i]);
            }
        }
        
        
        String[] answer = new String[al.size()];
        
        int i = 0;
        
        for (String s : al) {
            answer[i++] = s;
        }
        
        return answer;
    }
}