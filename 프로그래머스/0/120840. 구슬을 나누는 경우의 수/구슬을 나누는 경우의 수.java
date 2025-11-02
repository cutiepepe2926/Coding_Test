class Solution {
    public int solution(int balls, int share) {
        
        double upper_factorial = 1;
        double lower_factorial = 1;
        
        for (double n=balls; n>=balls-share+1; n--) {
            upper_factorial = upper_factorial * n;
        }
        for (double n=share; n>=1; n--) {
            lower_factorial = lower_factorial * n;
        }
        
        int answer = (int)(upper_factorial/lower_factorial);
        return answer;
    }
}