import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        LinkedList<Integer> ll = new LinkedList<>();
        
        for (int num : arr) {
            
            for (int i=0; i<num; i++) {
                ll.add(num);
            }
            
        }
        
        int[] answer = new int[ll.size()];
        
        int i = 0;
        
        for (int num : ll) {
            answer[i++] = num;
        }
        
        return answer;
    }
}