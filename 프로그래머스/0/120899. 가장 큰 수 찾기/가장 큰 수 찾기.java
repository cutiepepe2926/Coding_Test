import java.util.*;
class Solution {
    public int[] solution(int[] array) {
        
        int index = 0;
        int high = 0;
        for (int i=0; i<array.length; i++) {
            if (high < array[i]) {
                high = array[i];
                index = i;
            }
        }
        
        int[] answer = {high, index};
        return answer;
    }
}