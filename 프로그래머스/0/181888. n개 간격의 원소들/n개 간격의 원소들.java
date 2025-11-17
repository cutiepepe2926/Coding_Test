import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        LinkedList<Integer> ll = new LinkedList<>();
        
        for (int i=0; i<num_list.length; i+=n) {
            ll.add(num_list[i]);
        }
        int[] answer = ll.stream().mapToInt(x->x).toArray();
        return answer;
    }
}