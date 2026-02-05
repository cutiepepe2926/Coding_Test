class Solution {
    public int solution(int n) {
        
        int stop = calcOne(n);
        int answer = 0;
        
        while (true) {
            if (stop == calcOne(++n)) {
                answer = n;
                break;
            }
        }
        
        return answer;
    }
    
    // 1의 갯수 반환하기
    public int calcOne(int x) {
        String s = Integer.toBinaryString(x);
        
        int cnt = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                cnt++;
            }
        }
        
        return cnt;
        
    }
}