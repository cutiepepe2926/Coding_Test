class Solution {
    public int solution(int n) {
        int answer = 1;
        for (; (6*answer)%n!=0; answer++) {}
        return answer;
    }
}