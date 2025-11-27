class Solution {
    public int solution(String[] strArr) {
        int[] group = new int[31];
        
        for (String str : strArr) {
            group[str.length()]++;
        }
        
        int max = 0;
        
        for (int i : group) {
            if (max<i) {
                max = i;
            }
        }

        return max;
    }
}