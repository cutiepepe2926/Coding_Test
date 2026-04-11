import java.util.*;

class Solution {
    public int solution(int[] nums) {
        
        HashSet<Integer> rmDup = new HashSet<>();
        
        for (int n : nums) {
            rmDup.add(n);
        }
        
        int n2 = nums.length / 2;
        
        return (n2 >= rmDup.size())?(n2 * rmDup.size() / n2):(n2);
        
    }
}