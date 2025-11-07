import java.util.*;
class Solution {
    public int[] solution(int n, int[] numlist) {
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i=0; i<numlist.length; i++) {
            if (numlist[i]%n==0) {
                ll.add(numlist[i]);
            }
        }
        int[] answer = ll.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}