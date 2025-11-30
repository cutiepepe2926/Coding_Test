class Solution {
    public int[] solution(long n) {
        String[] list = String.valueOf(n).split("");
        
        int[] answer = new int[list.length];
        
        int j = 0;
        
        for (int i = list.length-1; i>=0; i--) {
            answer[i] = Integer.parseInt(list[j++]);
        }
        
        return answer;
    }
}