class Solution {
    public int solution(int[] common) {
        
        // 등차수열 : a(n+1) = an + d
        // 등비수열 : a(n+1) = a + d^(n)
        int a = common[0];
        int i = common.length-1;
        
        int d1 = common[1] - common[0];
        int d2 = common[2] - common[1];
        int d = 0;
        
        int answer = 0;
        
        if (d1==d2) {
            d = d1;
            answer = common[i] + d;
        }
        else {
            d = d2/d1;
            answer = common[i]*d;
        }
        
        return answer;
    }
}