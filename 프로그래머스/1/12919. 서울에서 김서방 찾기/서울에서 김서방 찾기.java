class Solution {
    public String solution(String[] seoul) {
        int i = 0;
        for (String s : seoul) {
            if (s.contains("Kim")) {
                break;
            }
            i++;
        }
        String answer = "김서방은 "+i+"에 있다";
        return answer;
    }
}