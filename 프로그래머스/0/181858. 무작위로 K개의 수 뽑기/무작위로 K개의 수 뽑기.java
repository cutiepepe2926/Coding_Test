import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
     
        Set<Integer> s = new LinkedHashSet<>();;
        
        for (int i : arr) {
            s.add(i);
        }
        
        Iterator<Integer> it = s.iterator();
        
        int[] answer = new int[k];
        Arrays.fill(answer,0,k,-1);
        
        for (int i = 0; i<k; i++) {
            
            if (it.hasNext()) {
                answer[i] = it.next();
            }
            
        }
        
        return answer;
    }
}