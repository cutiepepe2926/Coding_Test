import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        LinkedList<Integer> ll = new LinkedList<>();
        
        for (int a : arr) {
            if (a%divisor==0) {
                ll.add(a);
            }
        }
        
        int[] answer;
        
        if (ll.size()==0) {
            answer = new int[1];
            answer[0] = -1;
        }
        else {
            answer = new int[ll.size()];
            int i = 0;
            for (int l : ll) {
                answer[i++] = l;
            }
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}