import java.util.*;

class Solution {
    public int[] solution(int n, long left, long right) {
        
        int len = (int)(right - left + 1);
        int[] ans = new int[len];
        
        for (int i = 0; i < len; i++) {
            long k = left + i;
            long row = k / n;
            long col = k % n;
            ans[i] = (int)(Math.max(row,col) + 1);
        }
        
        return ans;
        
    }
}


//12345
//22345
//33345
//44445
//55555