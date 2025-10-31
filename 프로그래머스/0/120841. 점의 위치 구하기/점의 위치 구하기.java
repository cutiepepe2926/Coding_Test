class Solution {
    public int solution(int[] dot) {
        if (dot[0]>0) {
            if (dot[1]>0) return 1;
            else return 4;
        }
        else {
            //3 or 4
            if (dot[1]>0) return 2;
            else return 3;
            
        }
    }
}