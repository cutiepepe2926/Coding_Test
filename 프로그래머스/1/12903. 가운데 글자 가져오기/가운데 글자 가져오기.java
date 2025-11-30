class Solution {
    public String solution(String s) {
        String answer;
        
        if (s.length()%2==0) {
            int idx = s.length()/2 - 1;
            answer = s.substring(idx,idx+2);
        }
        else {
            answer = String.valueOf(s.charAt(s.length()/2));
        }

        return answer;
    }
}