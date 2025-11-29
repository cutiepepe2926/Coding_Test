import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        LinkedList<Integer> stk = new LinkedList<>();
        
        int i = 0;
        
        while (i<arr.length) {
            if (stk.size()==0) {
                stk.add(arr[i++]);
            }
            
            else if (stk.peekLast()==arr[i]) {
                stk.removeLast();
                i++;
            }
            else {
                stk.add(arr[i++]);
            }
        }  
        
        int[] answer;
        
        if (stk.size()==0) {
            answer = new int[1];
            answer[0] = -1;
        }
        else {
            int idx = 0;
            answer = new int[stk.size()];
            for (int num : stk) {
                answer[idx++] = num;   
            }
        }
        
        return answer;
    }
}