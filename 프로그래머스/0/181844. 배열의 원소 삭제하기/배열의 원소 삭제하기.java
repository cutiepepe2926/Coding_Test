import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        
        LinkedList<Integer> ll = new LinkedList<>();
        
        for (int num : arr) {
            ll.add(num);
        }
        
        for (int num : delete_list) {
            int idx = ll.indexOf(num);
            if (idx!=-1) {
                ll.remove(idx);
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