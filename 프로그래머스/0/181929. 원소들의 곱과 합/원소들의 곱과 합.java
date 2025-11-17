class Solution {
    public int solution(int[] num_list) {
        
        int sqrt_sum = 0;
        int multi_sum = 1;
        
        for (int i=0; i<num_list.length; i++) {
            sqrt_sum += num_list[i];
            multi_sum *= num_list[i];
        }
        
        int answer = (multi_sum > (sqrt_sum*sqrt_sum))?0:1;
        return answer;
    }
}