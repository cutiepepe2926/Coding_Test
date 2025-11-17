class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
        int[] result = new int[2];
        for (int i=0; i<answer.length; i++) {
            if (i==answer.length-1) {
                answer[i] = (result[1]>result[0])?(result[1]-result[0]):(result[1]*2);
                break;
            }
            
            answer[i] = num_list[i];
            if (i==answer.length-2) {
                result[1] = num_list[i];    
            }
            if (i==answer.length-3) {
                result[0] = num_list[i];
            }
        }
        
        return answer;
    }
}