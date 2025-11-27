import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        
        int[] front = Arrays.copyOfRange(num_list,0, n);
        int[] end = Arrays.copyOfRange(num_list, n, num_list.length);
        
        int[] answer = new int[num_list.length];
        
        for (int i=0; i<end.length; i++) {
            answer[i] = end[i];
        }
        for (int j=end.length, idx=0; j<answer.length; j++) {
            answer[j] = front[idx++];
        }
        return answer;
    }
}