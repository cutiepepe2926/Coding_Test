class Solution {
    public int solution(int i, int j, int k) {
        
        int answer = 0;
        for (;i<=j; i++) {
            String temp = String.valueOf(i);
            
            for (int s=0; s<temp.length(); s++) {
                if (String.valueOf(temp.charAt(s)).equals(String.valueOf(k))) {
                    answer++;
                }
            } 
        }
        return answer;
    }
}