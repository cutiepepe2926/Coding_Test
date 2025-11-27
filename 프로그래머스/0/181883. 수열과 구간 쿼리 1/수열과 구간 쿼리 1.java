class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        for (int i=0; i<queries.length; i++) {
            
            for (int s=queries[i][0]; s<=queries[i][1]; s++) {
                arr[s] = arr[s] + 1;
            }
            
        }
        
        int[] answer = arr;
        return answer;
    }
}