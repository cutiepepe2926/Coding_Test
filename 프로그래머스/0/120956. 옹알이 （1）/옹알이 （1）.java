class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] s = new String[babbling.length];
        for (int i=0; i<babbling.length; i++) {
            s[i] = babbling[i].replaceAll("aya|ye|woo|ma","");
            if (s[i].equals("")){
                answer++;
            }
        }
        
        return answer;
    }
}