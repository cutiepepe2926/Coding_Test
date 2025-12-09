import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('R',0); map.put('T',0);  
        map.put('C',0); map.put('F',0);  
        map.put('J',0); map.put('M',0);  
        map.put('A',0); map.put('N',0); 
        
        for (int i = 0; i < survey.length; i++) {
            if (choices[i]>4) {
                int point = choices[i] - 4;
                map.put(survey[i].charAt(1), map.getOrDefault(survey[i].charAt(1), 0) + point);
            }
            else if (choices[i]<4) {
                int point = (choices[i]==3)?1:(choices[i]==2)?2:3;
                map.put(survey[i].charAt(0), map.getOrDefault(survey[i].charAt(0), 0) + point);
            }
            else {
                continue;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append((map.getOrDefault('R',0) >= map.getOrDefault('T',0))?'R':'T');
        sb.append((map.getOrDefault('C',0) >= map.getOrDefault('F',0))?'C':'F');
        sb.append((map.getOrDefault('J',0) >= map.getOrDefault('M',0))?'J':'M');
        sb.append((map.getOrDefault('A',0) >= map.getOrDefault('N',0))?'A':'N');

        
        String answer = sb.toString();
        return answer;
    }
}