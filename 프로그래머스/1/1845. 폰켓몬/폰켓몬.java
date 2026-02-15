import java.util.*;

class Solution {
    public int solution(int[] nums) {
        
        HashSet<Integer> hs = new HashSet<>();
        
        for (int v : nums) {
            hs.add(v);
        }
        
        int answer = Math.min(hs.size(), nums.length/2);
        
        return answer;
    }
}