import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {        
        int[] answer = {};
        
        if (n==1) {
            answer = Arrays.copyOfRange(num_list, 0, slicer[1]+1);
        }
        
        if (n==2) {
            answer = Arrays.copyOfRange(num_list, slicer[0], num_list.length);
        }
        
        if (n==3) {
            answer = Arrays.copyOfRange(num_list, slicer[0], slicer[1]+1);
        }
        
        if (n==4) {
            int[] temp = Arrays.copyOfRange(num_list,slicer[0], slicer[1]+1);
            ArrayList<Integer> al = new ArrayList<>();
            for (int i=0; i<temp.length; i+=slicer[2]) {
                al.add(temp[i]);
            }
            int[] result = new int[al.size()];
            for (int i=0; i<al.size(); i++) {
                result[i] = al.get(i);
            }
            answer = result;
        }
        
        return answer;
    }
}