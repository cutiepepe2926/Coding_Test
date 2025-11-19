class Solution {
    public int solution(int[] sides) {
        // 둘 다 같은 경우 
        // 정삼각형인 경우 1=2=3
        // r이 가장 긴 변인 경우 -> 
        // 둘 다 긴 변인 경우
        int answer = 0;
        if (sides[0] == sides[1]) {
            // 정삼각형인 경우 + r이 가장 긴 변인 경우
            for (int i=sides[0]; i<2*sides[0]; i++) {
                answer++;
            }
            // 둘 다 긴 변인 경우
            for (int i=1; i<sides[0]; i++) {
                answer++;
            }
            return answer;
        }
        // 둘 다 다른 경우 -> 
        // sides 중에 긴 변이 존재하는 경우
        // 둘 중에 하나를 긴 걸로 지정
        int max = sides[0]>sides[1]? sides[0]: sides[1];
        int not_max = sides[0]>sides[1]? sides[1]: sides[0];
        
        // m < nm + r && r < m
        for (int i=max-1; max <not_max+i; i--) {
            answer++;
        }
        
        // sides 중에 긴 변이 없는 경우
        // max < r && not_max < r && r < m + nm
        int start = max;
        for (;start<max+not_max; start++) {
            answer++;
        }
        
        return answer;
    }
}