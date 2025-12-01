class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0,idx = 0; i < s.length(); i++) {
            
            if (s.charAt(i)==' ') {
                sb.append(s.charAt(i));
                idx = 0;
                continue;
            }
            else {
                if (idx%2==0) { //짝수
                    sb.append(String.valueOf(s.charAt(i)).toUpperCase());
                    idx++;
                }
                else { //홀수
                    sb.append(String.valueOf(s.charAt(i)).toLowerCase());
                    idx++;
                }
            }
        }
        
        String answer = sb.toString();
        return answer;
    }
}