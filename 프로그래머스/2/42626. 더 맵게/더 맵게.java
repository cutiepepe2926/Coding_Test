import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int v : scoville) {
            pq.add(v);
        }
        
        int answer = 0;
        
        while (true) {
            if (pq.peek() >= K) break;
            if (pq.size()==1 && pq.peek() < K) {
                answer = -1;
                break;
            }
            int a = pq.poll();
            int b = pq.poll() * 2;
            pq.add(a+b);
            answer++;
        }
        
        return answer;
    }
}