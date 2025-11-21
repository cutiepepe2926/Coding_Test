class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
                
        int incli1 = (dots[1][1]-dots[0][1])*(dots[3][0]-dots[2][0]);  
        int incli2 = (dots[3][1]-dots[2][1])*(dots[1][0]-dots[0][0]);

        if (incli1==incli2) return 1;
        
        incli1 = (dots[2][1]-dots[0][1])*(dots[3][0]-dots[1][0]);
        incli2 = (dots[3][1]-dots[1][1])*(dots[2][0]-dots[0][0]);
        
        if (incli1==incli2) return 1;
        
        incli1 = (dots[3][1]-dots[0][1])*(dots[2][0]-dots[1][0]);
        incli2 = (dots[2][1]-dots[1][1])*(dots[3][0]-dots[0][0]);
        
        if (incli1==incli2) return 1;
        
        return answer;
    }
}