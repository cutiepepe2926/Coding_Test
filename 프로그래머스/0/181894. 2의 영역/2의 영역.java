import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        LinkedList<Integer> ll = new LinkedList<>();
        
        for (int i=0; i<arr.length; i++) {
            if (arr[i]==2) {
                ll.add(i);
            }
        }
        
        if (ll.size()==0) {
            int[] answer = {-1};
            return answer;
        }
        
        int start = ll.peekFirst();
        int end = ll.peekLast();
        int[] answer = Arrays.copyOfRange(arr, start,end+1);
        return answer;
    }
}