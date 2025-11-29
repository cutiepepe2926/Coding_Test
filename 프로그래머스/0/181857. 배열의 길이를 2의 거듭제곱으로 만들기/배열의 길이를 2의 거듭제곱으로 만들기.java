import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int i = 1;

        while (i<arr.length) {
            i *= 2;
        }
        
        int[] answer = Arrays.copyOfRange(arr,0,i);
        
        return answer;
    }
}