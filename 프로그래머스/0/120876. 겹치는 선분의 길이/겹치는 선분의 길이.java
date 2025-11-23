class Solution {
    public int solution(int[][] lines) {
        int[] count = new int[201];


        for (int[] line : lines) {
            int a = line[0];
            int b = line[1];

            int start = Math.min(a, b);
            int end   = Math.max(a, b);

            for (int x = start; x < end; x++) {
                count[x + 100]++;
            }
        }

        int answer = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] >= 2) {
                answer++;
            }
        }

        return answer;
    }
}