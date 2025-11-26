class Solution {
    public int solution(String myString, String pat) {
        StringBuilder sb = new StringBuilder();
        sb.append(myString);
        
        for (int i = 0; i<myString.length(); i++) {
            if (sb.charAt(i) - 'A' == 0) {
                sb.setCharAt(i,'B');
            }
            else {
                sb.setCharAt(i,'A');
            }
        }
        
        int answer = (sb.toString().contains(pat))?1:0;

        return answer;
    }
}