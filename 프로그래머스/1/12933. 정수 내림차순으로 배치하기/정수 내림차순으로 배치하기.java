import java.util.*;

class Solution {
    public long solution(long n) {
        String[] nums = String.valueOf(n).split("");
        
        Arrays.sort(nums);
        
        StringBuilder sb = new StringBuilder();
        
        for (int i=nums.length-1; i>=0; i--) {
            sb.append(nums[i]);
        }
        
        long answer = Long.parseLong(sb.toString());
        return answer;
    }
}