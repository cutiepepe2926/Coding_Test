import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int abs = 101;
        int answer = 0;
        for (int i=array.length-1; i>=0; i--) {
            if ( Math.abs(array[i]-n) <= abs ) {
                abs = Math.abs(array[i]-n);
                answer = array[i];
            }
        }
        return answer;
    }
}