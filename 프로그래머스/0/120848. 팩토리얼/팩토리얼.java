class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i=1,j=1; i<=10; i++) {
            j = j * i;
            if (j==n) {
                answer = i;
                break;
            }
            else if (j<n) {
                continue;
            }
            else { //j>n
                answer = i-1;
                break;
            }
        }
        
        return answer;
    }
}
