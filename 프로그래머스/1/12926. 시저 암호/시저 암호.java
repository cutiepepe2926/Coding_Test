class Solution {
    public String solution(String s, int n) {
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                sb.append(" ");
            }
            else {
                // lowercase
                if (s.charAt(i)-'a' >= 0) {
                    if (s.charAt(i)+n > 'z') {
                        int over = s.charAt(i) + n - 'z' - 1;
                        sb.append((char)('a'+over));
                    }
                    else {
                        sb.append((char)(s.charAt(i) + n));   
                    }
                }
                // uppercase
                else {
                    if (s.charAt(i)+n > 'Z') {
                        int over = s.charAt(i) + n - 'Z' - 1;
                        sb.append((char)('A'+over));
                    }
                    else {
                        sb.append((char)(s.charAt(i) + n));   
                    }
                }
            }
        }
        
        String answer = sb.toString();
        return answer;
    }
}