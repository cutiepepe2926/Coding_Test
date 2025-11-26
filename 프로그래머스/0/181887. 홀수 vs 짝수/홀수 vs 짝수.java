class Solution {
    public int solution(int[] num_list) {
        int odd = 0;
        int even = 0;
        int i = 0;
        
        for (int num : num_list) {
            if (i++%2==0) {
                even += num;
            }
            else {
                odd += num;
            }
        }
        int answer = (even>=odd)?even:odd;
        return answer;
    }
}