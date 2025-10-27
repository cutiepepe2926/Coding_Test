import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> AL = new ArrayList<>();
        for (int i=0; i<=n; i++) {
            if (i%2!=0) {
                AL.add(i);
            }
        }
        
        int[] answer = AL.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}