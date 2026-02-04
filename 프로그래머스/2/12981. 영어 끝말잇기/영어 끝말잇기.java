import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        
        // 몇번 나왔는 지 체크용
        HashMap<String, Integer> howMany = new HashMap<>();
        
        for (String s : words) {
            howMany.put(s,0);
        }

        // 각 인원 별 차례 저장용 - 0부터 시작, 나올때마다 + 1
        int[] people = new int[n];
        
        // 멈춘 지점
        int stop = 0;
        int wl = words.length;
        // 통과 여부
        boolean ok = true;
        
        for (int i = 0; i < wl; i++) {
            
            if (i > 0) {
                // 끝 단어와 시작 단어가 다른 경우
                if (words[i].charAt(0) != words[i-1].charAt(words[i-1].length()-1)) {
                    ok = false;
                    stop = i;
                    break;
                } 
            }
            
            // 몇 번 나왔는가?
            int cnt = howMany.get(words[i]);
            
            // 2번 이상이니 끝
            if (cnt > 0) {
                ok = false;
                stop = i;
                break;
            }
            
            // 해당 단어 출현 수 + 1
            howMany.put(words[i], cnt+1);
            
            // 인원 별 차례 + 1
            people[i%n]++;
        }
        
        // 사람, 차례
        int[] answer;
        
        if (ok) answer = new int[]{0,0};
        else answer =  new int[]{(stop)%n + 1, people[(stop)%n] + 1};

        return answer;
    }
}