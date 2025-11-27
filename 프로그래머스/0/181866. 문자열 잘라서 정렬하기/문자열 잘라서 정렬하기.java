import java.util.*;

class Solution {
    public String[] solution(String myString) {
        
        String[] temp = myString.replaceAll("x"," ").split(" ");
        
        ArrayList<String> al = new ArrayList<>();
        
        for (String s : temp) {
            if (!s.equals("")) {
                al.add(s);
            }
        }
        
        String[] answer = new String[al.size()];
        
        int i = 0;
        
        for (String s : al) {
            answer[i++] = s;
        }
        
        Arrays.sort(answer);
        return answer;
    }
}