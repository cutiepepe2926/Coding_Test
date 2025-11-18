class Solution {
    public int solution(int[] num_list) {
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();
        
        for (int i=0; i<num_list.length; i++) {
            if (num_list[i]%2!=0) {
                odd.append(String.valueOf(num_list[i]));
            }
            else {
                even.append(String.valueOf(num_list[i]));
            }
        }
        
        int answer = Integer.parseInt(odd.toString()) + Integer.parseInt(even.toString());
        return answer;
    }
}