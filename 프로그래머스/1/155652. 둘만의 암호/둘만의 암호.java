class Solution {
    public String solution(String s, String skip, int index) {
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            sb.append(plusIndex(s.charAt(i), skip, index));
        }
        
        String answer = sb.toString();

        return answer;
    }
    
    public char plusIndex(char c, String skip, int index) {
        
        char result = c;
        
        for (int i = 1; i <= index;) {
            
            result = (char)(result + 1);
            
            if (result > 'z') {
            
                result = 'a';
            
            }
            
            if (skip.contains(String.valueOf(result))) {
                continue;    
            }
            
            else {
                i++;
            }
            
        }
        
        return result;
    } 
}