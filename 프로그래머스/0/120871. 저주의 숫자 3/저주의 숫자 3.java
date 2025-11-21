class Solution {
    public int solution(int n) {
        
        int i=1; //현재 숫자
        int cursedNum = 0; //저주받은 숫자
        while(i<=n) {
            
            cursedNum++;
            
            if (cursedNum%3==0 || String.valueOf(cursedNum).contains("3") ) {
                continue;
            }
            i++;
        }
        
        return cursedNum;
    }
}