import java.util.*;

class Solution {
    public int[][] solution(int[][] arr) {
        int garo = arr[0].length;
        int sero = arr.length;
        
        int[][] answer;
        
        // 동일한 경우 그대로 리턴
        if (garo == sero) {
            return arr;
        }
        
        // 가로가 세로보다 낮은 경우, 가로 축 추가
        if (garo < sero) {
            for (int i=0; i<sero; i++) {
                arr[i] = Arrays.copyOfRange(arr[i], 0, sero);
            }
            return arr;
        }
        // 가로가 세로보다 큰 경우, 세로 축 추가
        else {
            answer = new int[garo][garo];
            
            for (int i=0; i<sero; i++) {
                answer[i] = arr[i];
            }
        }
        
        return answer;
    }
}