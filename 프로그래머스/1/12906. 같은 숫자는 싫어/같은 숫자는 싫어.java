import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(arr[0]);
        
        for (int idx = 1; idx<arr.length; idx++) {
            if (ll.peekLast()!=arr[idx]) {
                ll.add(arr[idx]);
            }
        }

        int[] answer = new int[ll.size()];
        int i = 0;
        for (int l : ll) {
            answer[i++] = l;
        }

        return answer;
    }
}