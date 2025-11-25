import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        
        LinkedList<Integer> ll = new LinkedList<>();
        
        for (String intStr : intStrs) {
            int part = Integer.parseInt(intStr.substring(s,s+l));
            if (part > k) {
                ll.add(part);
            }
        }
        int[] answer = ll.stream().mapToInt(x->x).toArray();
        return answer;
    }
}