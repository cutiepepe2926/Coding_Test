class Solution {
    public int solution(int n) {
        if (n<=7) {
            return 1;
        }
        
        int people = n/7;
        if (n%7!=0) {
            people++;
        }
            
        int answer = people;
        return answer;
    }
}