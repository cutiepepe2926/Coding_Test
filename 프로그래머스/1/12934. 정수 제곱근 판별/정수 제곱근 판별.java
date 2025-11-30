class Solution {
    public long solution(long n) {
        long temp = 1;
        
        while(temp * temp <= n) {
            if (temp * temp == n) {
                return (temp+1)*(temp+1);
            }
            temp++;
        }
    
        return -1;
    }
}