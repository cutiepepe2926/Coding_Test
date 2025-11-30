import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        
        if (arr.length==1) {
            answer = new int[1];
            answer[0] = -1;
        }
        else {
            int min = arr[0];
            for (int a : arr) {
                if (min > a) {
                    min = a;
                }
            }
            LinkedList<Integer> ll = new LinkedList<>();
            for (int a : arr) {
                if (a!=min) {
                    ll.add(a);
                }
            }
            answer = new int[ll.size()];
            int i = 0;
            for (int l : ll) {
                answer[i++] = l;
            }  
        }
        
        return answer;
    }
}