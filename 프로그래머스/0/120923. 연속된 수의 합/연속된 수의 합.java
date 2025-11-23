import java.util.*;

class Solution {
    public int[] solution(int num, int total) {
        // (x + x + 1 + x + 2 + ... + x + num -1)
        // num * x + (0 + ... + num -1)
        int n_sum = num_sum(num);
        // int i = -49;
        // while(true) {
        //    if ( (i * num + n_sum )==total) {
        //        break;
        //    }
        //     else {
        //         i++;
        //     }
        // }
        int i = ( total - n_sum ) / num;
        
        LinkedList<Integer> ll = new LinkedList<>();
        
        for (int j=0; j<num; j++) {
            ll.add(++i);
        }
            
            
        int[] answer = ll.stream().mapToInt(x->x).toArray();
        return answer;
    }
    
    public int num_sum(int num) {
        if (num==0) {
            return 0;
        }
        return num + num_sum(num-1);
    }
    
}