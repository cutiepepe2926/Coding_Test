class Solution {
    public int solution(String A, String B) {
        
        if (A.equals(B)) {
            return 0;
        }
        
        // 우측으로 밀기
        for (int push=1; push<A.length(); push++) {
            
            StringBuilder sb = new StringBuilder();
            
            for (int index = A.length()-1, count=0; count<A.length(); count++ ) {
                sb.append( A.charAt( (index+count)%(A.length()) ) );
            }
            
            A = sb.toString();
            
            if (A.equals(B)) {
                return push;
            }
            
        }
        
        return -1;
    }
}