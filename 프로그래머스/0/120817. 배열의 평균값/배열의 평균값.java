class Solution {
    public double solution(int[] numbers) {
        double total = 0;
        for (int i : numbers) {
            total += (double)i;
        }
        double answer = total/(double)numbers.length;
        return answer;
    }
}