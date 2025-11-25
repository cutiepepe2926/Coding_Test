class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder();
        
        sb.append(my_string.substring(0,s));
        
        StringBuilder rse = new StringBuilder();
        rse.append(my_string.substring(s,e+1)).reverse();
        
        sb.append(rse.toString());
        
        if (my_string.length()>e) {
            sb.append(my_string.substring(e+1,my_string.length()));
        }
        
        String answer = sb.toString();
        return answer;
    }
}