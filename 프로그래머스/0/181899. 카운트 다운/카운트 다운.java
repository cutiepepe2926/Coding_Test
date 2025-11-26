import java.util.*;

class Solution {
    public int[] solution(int start_num, int end_num) {
        LinkedList<Integer> ll = new LinkedList<>();
        
        for (int i=start_num; i>=end_num; i--) {
            ll.add(i);
        }
        
        int[] answer = ll.stream().mapToInt(x->x).toArray();
        return answer;
    }
}