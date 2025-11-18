class Solution {
    public String solution(String code) {
        StringBuilder sb = new StringBuilder();
        boolean mode = false;
        
        for (int idx=0; idx<code.length(); idx++) {
            // 모드 변경
            if (code.charAt(idx)=='1') {
                mode = !mode;
                continue;
            }
            
            if (mode==false) {
                if (idx%2==0) {
                    sb.append(code.charAt(idx));
                }    
            }
            
            else {
                if (idx%2!=0) {
                    sb.append(code.charAt(idx));
                }
            }
        }
        
        
        String answer = sb.toString().equals("")?"EMPTY":sb.toString();
        return answer;
    }
}