import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        
        String s = "";
        int s_idx = 0;
        
        for (int i=0; i<str_list.length; i++) {
            if (str_list[i].equals("l") || str_list[i].equals("r")) {
                s = str_list[i];
                s_idx = i;
                break;
            }
        }
        
        String[] answer = {};
        
        if (s.equals("")) {
            return answer;
        }
        
        if (s.equals("l")) {
            answer = Arrays.copyOfRange(str_list,0,s_idx);
        }
        else {
            answer = Arrays.copyOfRange(str_list,s_idx+1, str_list.length);
        }
        
        return answer;
    }
}