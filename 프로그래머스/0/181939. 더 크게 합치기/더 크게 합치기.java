class Solution {
    public int solution(int a, int b) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        
        s1.append(String.valueOf(a));
        s1.append(String.valueOf(b));
        s2.append(String.valueOf(b));
        s2.append(String.valueOf(a));
        
        int left = Integer.parseInt(s1.toString());
        int right = Integer.parseInt(s2.toString());
        
        int answer = (left>=right)? left : right;
        return answer;
    }
}