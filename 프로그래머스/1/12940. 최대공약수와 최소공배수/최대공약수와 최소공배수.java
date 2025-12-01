class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        answer[0] = gcd(n,m);
        answer[1] = n*m/answer[0]; //두 곱 / 최대공약수 = 최소공배수
           
        return answer;
    }
    
    public static int gcd(int x, int y) {
        if (y==0) {
            return x;
        }
        else {
            return gcd(y, x%y);
        }
    }
}