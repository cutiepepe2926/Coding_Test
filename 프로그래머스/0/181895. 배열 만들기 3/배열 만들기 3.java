import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        
        int[] cut1 = Arrays.copyOfRange(arr, intervals[0][0], intervals[0][1]+1);
        int[] cut2 = Arrays.copyOfRange(arr, intervals[1][0], intervals[1][1]+1);
        
        ArrayList<Integer> al = new ArrayList<>();
        
        for (int i : cut1) {
            al.add(i);
        }
        
        for (int j : cut2) {
            al.add(j);
        }
        
        int[] answer = new int[al.size()];
        
        int i=0;
        
        for (int k : al) {
            answer[i++] = k;
        }
        
        return answer;
    }
}