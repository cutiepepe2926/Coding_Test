class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        for (int c=0; c<queries.length; c++) {
            
            int i = queries[c][0];
            int j = queries[c][1];
            
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            
            
        }
        
        int[] answer = arr;
        return answer;
    }
}