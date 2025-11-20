class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        // 쿼리만큼 반복
        for (int q=0; q<queries.length; q++) {
            //쿼리 구간에서 이동
            for (int i=queries[q][0]; i<=queries[q][1]; i++) {
                //만약 i가 k의 배수인 경우
                if (i%queries[q][2]==0) {
                    arr[i] = arr[i] + 1;
                }
            }
        }
        
        return arr;
    }
}

//s<=i<=e -> every i if i = n * k -> arr[i]++