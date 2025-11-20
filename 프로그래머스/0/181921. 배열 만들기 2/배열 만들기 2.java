import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        LinkedList<Integer> ll = new LinkedList<>();
        
        for (int i=l; i<=r; i++) {
            if (i%5==0) {
                String temp = String.valueOf(i);
                temp = temp.replaceAll("5","-");
                temp = temp.replaceAll("0","-");
                boolean check = true;
                for (int j=0; j<temp.length(); j++) {
                    if (temp.charAt(j)!='-') {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    ll.add(i);    
                }
            }
        }
        if (ll.size()==0) {
            ll.add(-1);
        }
        
        int[] answer = ll.stream().mapToInt(x->x).toArray();
        return answer;
    }
}