class Solution {
    public int solution(int[][] dots) {
        // x값이 동일한 애들끼리 추출
        // y값이 동일한 애들끼리 추출
        
        // 세로 값을 저장할 변수(높이)
        int sero = dots[0][1];
        // 가로 값을 저장할 변수(밑선)
        int garo = dots[0][0];
        // 첫 번째 좌표의 x값과 같은 놈 추출해서 높이를 구한다
        for (int i=1; i<dots.length; i++) {
            if (dots[0][0]==dots[i][0]) {
                sero = Math.abs(sero-dots[i][1]);
            }
        }
        // 첫 번째 좌표의 y값과 같은 놈 추출해서 밑선을 구한다
        for (int i=1; i<dots.length; i++) {
            if (dots[0][1]==dots[i][1]) {
                garo = Math.abs(garo-dots[i][0]);
            }
        }
        
        int answer = garo * sero;
        return answer;
    }
}