class Solution {
    public int solution(int[] sides) {
        int max = 0;
        int total = 0;
        
        for (int i=0; i<3; i++) {
            if (max<sides[i]) {
                max = sides[i];
            }
            total += sides[i];
        }
        return (max<(total-max))?1:2;
    }
}