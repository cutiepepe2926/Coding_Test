class Solution {
    public int solution(int a, int b) {
        
        int div = 0;
        
        while (!(div==1)) {
            div = gcd(a,b);
            a = a/div;
            b = b/div;
        }
        
        while (b%2==0) {
            b = b/2;
        }
        while (b%5==0) {
            b = b/5;
        }
        return (b==1)?1:2;
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