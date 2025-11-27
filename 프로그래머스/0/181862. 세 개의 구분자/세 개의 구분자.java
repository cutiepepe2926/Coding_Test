import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        StringBuilder sb = new StringBuilder();
        sb.append(myStr);
        
        for (int i=0; i<myStr.length(); i++) {
            if (myStr.charAt(i)=='a' || myStr.charAt(i)=='b' || myStr.charAt(i)=='c') {
                sb.setCharAt(i, ' ');
            }
        }

        StringTokenizer st = new StringTokenizer(sb.toString());
        
        int length = st.countTokens();
        
        if (length==0) {
            String[] answer = {"EMPTY"};
            return answer;
        }
        
        String[] answer = new String[length];
        
        int i = 0;
        
        while (st.hasMoreTokens()) {
            answer[i++] = st.nextToken();
        }
        
        return answer;
    }
}