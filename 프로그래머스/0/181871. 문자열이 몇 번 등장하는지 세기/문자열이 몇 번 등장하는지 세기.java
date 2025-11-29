class Solution {
    public int solution(String myString, String pat) {
        
        int answer = 0;
        
        for (int i=0; i<myString.length(); i++) {
            
            StringBuilder sb = new StringBuilder();
            
            for (int j=i; j<i+pat.length(); j++) {
                if (j>=myString.length()) {
                    break;
                }
                sb.append(myString.charAt(j));
            }
            
            if (sb.toString().equals(pat)) {
                answer++;
            }
            
        }
        
        return answer;
    }
}