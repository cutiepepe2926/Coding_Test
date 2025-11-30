class Solution {
    public int solution(int num) {
        long n = num;
        int answer = 0;
        
        while(n!=1 && answer<=500) {
            answer++;
            if (n%2==0) {
                n /= 2;
            }
            else {
                n = 3 * n + 1;
            }
        }
        
        return (answer>=500)?-1:answer;
    }
}