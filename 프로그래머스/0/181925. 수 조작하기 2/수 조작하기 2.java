class Solution {
    public String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        int prev = numLog[0];
        for (int i=1; i<numLog.length; i++) {
            int temp = numLog[i]-prev;
            if (temp==1) sb.append("w");
            if (temp==-1) sb.append("s");
            if (temp==10) sb.append("d");
            if (temp==-10) sb.append("a");
            prev = numLog[i];
        }
        
        String answer = sb.toString();
        return answer;
    }
}