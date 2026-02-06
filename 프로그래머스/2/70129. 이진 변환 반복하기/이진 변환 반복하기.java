class Solution {
    public int[] solution(String s) {
        
        int cntZero = 0;
        int cntBinary = 0;
        
        while (!s.equals("1")) {
            
            StringBuilder sb = new StringBuilder();
            
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    sb.append(s.charAt(i));
                }
                else {
                    cntZero++;
                }
            }
            
            s = Integer.toBinaryString(sb.toString().length());
            
            cntBinary++;
            
        }
        
        int[] answer = new int[]{cntBinary, cntZero};
        return answer;
    }
}