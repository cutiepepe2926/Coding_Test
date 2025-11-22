import java.util.*;
class Solution {
    public int[] solution(int n) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(n);
        
        if (n!=1) {
            while(n!=1) {
                if (n%2==0) {
                    n = n/2;
                    ll.add(n);
                }
                else {
                    n = 3 * n + 1;
                    ll.add(n);
                }
            }
        }
        
        int[] answer = ll.stream().mapToInt(x->x).toArray();
        
        return answer;
    }
}