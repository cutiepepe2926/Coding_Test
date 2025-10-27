import java.util.*;

class Solution {
    public int[] solution(int n) {
        LinkedList<Integer> LL = new LinkedList<>();
        
        for (int i=1; i<=n; i++) {
            if (i%2!=0) {
                LL.add(i);
            }
        }
        int[] answer = new int[LL.size()];
        for (int i=0; i<LL.size(); i++) {
            answer[i] = LL.get(i);
        }
        return answer;
    }
}