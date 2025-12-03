import java.util.*;

class Solution {
    public String solution(int[] food) {
        
        StringBuilder left = new StringBuilder();
        
        StringBuilder right = new StringBuilder();
        
        evenFood(food);
        
        for (int i = 1; i < food.length; i++) {
            
            for (int j = food[i]/2; j < food[i]; j++) {
                left.append(i);
                right.append(i);
            }
            
        }
        
        
        
        String answer = left.append(0).append(right.reverse().toString()).toString();
        
        return answer;
    }
    
    public void evenFood(int[] food) {
        for (int i = 1; i < food.length; i++) {
            
            int temp = food[i];
            
            if (temp%2!=0) {
                food[i] = food[i] - 1;
            }
            
        }
    }
}