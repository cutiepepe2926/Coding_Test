class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        int result_len = queries.length;
        int[] answer = new int[result_len];
        
        // answer 배열에 순차적 삽입
        for (int i=0; i<result_len; i++) {
            
            // 가장 작은 값 변수
            int lowest = 1000001;
            
            // s <= i <= e 범위만큼 움직이도록 지정
            for (int idx=queries[i][0]; idx<=queries[i][1]; idx++) {
                // arr[i]가 k보다 큰지 확인
                if (arr[idx]>queries[i][2]) {
                    if (lowest>arr[idx]) { // 가장 작은 값인 경우 변경
                        lowest = arr[idx]; 
                    }
                }
            }
            if (lowest==1000001) {
                answer[i] = -1;
                continue;
            }
            
            // 삽입
            answer[i] = lowest;
                
        }
        
        return answer;
    }
}