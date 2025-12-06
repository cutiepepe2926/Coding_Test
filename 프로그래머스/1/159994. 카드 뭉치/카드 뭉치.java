import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = makeSentence(cards1, cards2, goal);
        
        return answer;
    }
    
    static String makeSentence(String[] cards1, String[] cards2, String[] goal) {
        String[] temp = new String[goal.length];
        
        for (int pl=0, pr=0, writeIndex=0; writeIndex < goal.length; writeIndex++) {
            if (pl+1 <= cards1.length) {
                if (goal[writeIndex].equals(cards1[pl])) {
                    temp[writeIndex] = cards1[pl];
                    pl++;
                    continue;
                }
            }
            
            if (pr+1 <= cards2.length) {
                if (goal[writeIndex].equals(cards2[pr])) {
                    temp[writeIndex] = cards2[pr];
                    pr++;
                    continue;
                }   
            }
        }
        if (Arrays.equals(temp, goal)) {
            return "Yes";
        }
        
        return "No";
        
    }
}