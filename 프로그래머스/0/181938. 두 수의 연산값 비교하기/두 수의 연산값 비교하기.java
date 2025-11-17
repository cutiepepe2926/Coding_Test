class Solution {
    public int solution(int a, int b) {
        int left = Integer.parseInt( ""+a+b );
        int right = Integer.parseInt( (2*a*b) +"" );
        int answer = (left>=right)? left : right;
        return answer;
    }
}