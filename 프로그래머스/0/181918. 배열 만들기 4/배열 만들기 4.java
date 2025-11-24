import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        LinkedList<Integer> ll = new LinkedList<>();
        
        for (int i=0; i<arr.length;) {
            if (ll.size()==0) {
                ll.add(arr[i]);
                i++;
            }
            else {
                if ( ll.peekLast() < arr[i] ) {
                    ll.add(arr[i]);
                    i++;
                }
                else {
                    ll.removeLast();
                }
            }
        }
        
        int[] stk = ll.stream().mapToInt(x->x).toArray();
        
        return stk;
    }
}