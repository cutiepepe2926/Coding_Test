import java.util.*;
class Solution {
    public int solution(String before, String after) {
        LinkedList<String> ll = new LinkedList<>();
        for (int i=0; i<before.length(); i++) {
            ll.add(String.valueOf(before.charAt(i)));
        }
        
        for (int i=0; i<after.length(); i++) {
            boolean temp = ll.remove(String.valueOf(after.charAt(i)));
            if (temp==false) {
                return 0;
            }
        }
        
        return 1;
    }
}