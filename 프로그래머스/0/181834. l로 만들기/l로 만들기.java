class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        sb.append(myString);
        
        for (int i = 0; i < myString.length(); i++) {
            if (sb.charAt(i) < 'l') {
                sb.setCharAt(i,'l');
            }  
        }
        
        String answer = sb.toString();
        
        return answer;
    }
}
