import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        // arraylist
        ArrayList<Integer> list = new ArrayList<>();
        for (int p : progresses) { list.add(p); }
        
        ArrayList<Integer> spd = new ArrayList<>();
        for (int s : speeds) { spd.add(s); }
        
        // return
        ArrayList<Integer> deploy = new ArrayList<>();
        
        while (!list.isEmpty()) {
            
            for (int i = 0; i < list.size(); i++) {
                list.set(i, list.get(i) + spd.get(i));
            }
            
            int dp = 0;
            
            for (int l : list) {
                if (l >= 100) {
                    dp++;
                }
                else {
                    break;
                }
            }
            
            if (dp > 0) {
                deploy.add(dp);
                
                for (int i = 0; i < dp; i++) {
                    list.remove(0);
                    spd.remove(0);
                }
            }
        }
        
        
        int[] answer = new int[deploy.size()];
        int z = 0;
        for (int d : deploy) { answer[z++] = d; }
        return answer;
    }
}