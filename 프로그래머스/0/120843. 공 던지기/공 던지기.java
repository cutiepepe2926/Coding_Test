class Solution {
    public int solution(int[] numbers, int k) {
        
        int people = numbers.length;
        int answer = 0;
        int start = -2;
        
        for (int i=1; i<=k; i++) {
            answer = (start + 2) % people;
            start = start+2;
        }
        answer++;
        return answer;
    }
}