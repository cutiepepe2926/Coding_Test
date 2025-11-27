import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        
        LinkedList<Integer> ll = new LinkedList<>();
        
        int  i = 0;
        
        for (boolean f : flag) {
            if (f) {
                for (int j=1; j<=arr[i]*2; j++ ) {
                    ll.add(arr[i]);   
                }
            }
            else {
                for (int j=1; j<=arr[i]; j++) {
                    ll.removeLast();
                }
            }
            i++;
        }
        
        //int[] answer = ll.stream().mapToInt(x->x).toArray();
        int[] answer = new int[ll.size()];
        
        int idx = 0;
        
        for (int num : ll) {
            answer[idx++] = num;
        }
        
        return answer;
    }
}
