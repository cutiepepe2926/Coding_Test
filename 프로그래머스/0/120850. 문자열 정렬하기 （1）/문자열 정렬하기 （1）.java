import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int length = 0;
        for (int i=0; i<my_string.length(); i++) {
            if(my_string.charAt(i) <  'A') {
                length++;
            }
        }
        
        int[] answer = new int[length];
        
        for (int i=0,j=0; i<my_string.length(); i++) {
            if(my_string.charAt(i) <  'A') {
                answer[j] = (my_string.charAt(i)-'0');
                j++;
            }
        }
    
        Arrays.sort(answer);
        return answer;
    }
}