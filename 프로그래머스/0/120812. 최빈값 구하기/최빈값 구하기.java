import java.util.*;

class Solution {
    public int solution(int[] array) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for (int i : array) {
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        
        int max = 0;
        int mode = -1;
        
        for (int key : hm.keySet()) {
            int value = hm.get(key);
            if (value > max) {
                max = value;
                mode = key;
            }
            else if (value==max) {
                mode = -1;
            }
        }
        return mode;
    }
}