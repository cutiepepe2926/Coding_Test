import java.util.*;

class Solution {
    public int[] solution(int n) {
        LinkedList<Integer> num = new LinkedList<>();
        int check = 0;
        if (n%2==0) {
            num.add(2);
        }
        
        for (int i=2; i<=n; i++) {
            if (n%i==0) {
                for (int j=2; j<=i; j++) {
                    if (i!=j && i%j==0) {
                        check=0;
                        break;
                    }
                    if (i!=j && i%j!=0) {
                        check=1;
                    }
                }
                if (check==1) {
                    num.add(i);
                }
            }
        }
        
        int[] answer = num.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}