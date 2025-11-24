import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        LinkedHashMap<Integer, Integer> lhs = new LinkedHashMap<>();
        lhs.put(a,0); lhs.put(b,0); lhs.put(c,0); lhs.put(d,0);
        int[] list = {a,b,c,d};
        int answer = 0;
        
        // 네 주사위에서 나온 숫자가 모두 p로 같은 경우
        if (lhs.size()==1) {
            return 1111 * a;
        }
        
        for (int num : lhs.keySet()) {
            for (int i=0; i<list.length; i++) {
                if (num == list[i]) {
                    Integer current = lhs.get(num);
                    lhs.put(num, current + 1);
                }
            }
        }
        
        // 세 주사위에서 나온 숫자가 p로 같고 나머지 하나가 q인 경우
        // 두 개씩 p, q가 나온 경우
        if (lhs.size()==2) {
            // 세 주사위에서 나온 숫자가 p로 같고 나머지 하나가 q인 경우
            Iterator<Integer> it = lhs.keySet().iterator();
            int p = it.next();
            int q = it.next();
            if (lhs.get(p)!=2) {
                if (lhs.get(p)==3) {
                    answer = (10*p+q) * (10*p+q);
                }
                else {
                    answer = (10*q+p) * (10*q+p);
                }
            }
            // 두 개씩 p, q가 나온 경우
            else {
                int temp = (p + q) * Math.abs(p-q);
                answer = temp;
            }
        }

        
        // 두 개의 주사위가 p고, 나머지 q와 r인 경우
        if (lhs.size()==3) {
            int temp = 1;
            for (int num : lhs.keySet()) {
                if (lhs.get(num)==1) {
                    temp *= num;
                }
            }
            answer = temp;
        }
        
        // 네 주사위에 적힌 숫자가 모두 다른 경우
        if (lhs.size()==4) {
            int min = 7;
            for (int num : lhs.keySet()) {
                if (num < min) {
                    min = num;
                }
            }
            answer = min;
        }
        
        return answer;
    }
}