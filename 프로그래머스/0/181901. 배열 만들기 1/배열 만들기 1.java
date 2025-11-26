import java.util.*;

class Solution {
    public int[] solution(int n, int k) {
        ArrayList<Integer> al = new ArrayList<>();
        
        for (int i=1; i<=n; i++) {
            if (i%k==0) {
                al.add(i);
            }
        }
        
        int[] answer = al.stream().mapToInt(x->x).toArray();
        return answer;
    }
}