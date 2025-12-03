import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        
        Set<Integer> s = new HashSet<>();
        
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                s.add(numbers[i] + numbers[j]);
            }
        }
        
        int[] answer = new int[s.size()];
        
        Iterator<Integer> it = s.iterator();
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = it.next();
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}