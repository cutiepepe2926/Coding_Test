import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        ArrayList<Integer> answer = new ArrayList<>();
        
        for (int i = 0; i < score.length; i++) {
            
            pq.add(score[i]);
            
            // k초과 시 -> 최소값 하나 제거 그 다음 값 출력
            if (pq.size() > k) {
                pq.poll();
                answer.add(pq.peek());
            }
            // k 이하 시 그대로 최소값 출력
            else {
                answer.add(pq.peek());
            }
            
        }
        
        int[] ans = new int[answer.size()];
        
        for (int i = 0; i < answer.size(); i++) {
            ans[i] = answer.get(i);
        }
     
        return ans;
        
    }
}