class Solution {
    public int solution(int n) {
        
        //10진법 -> 3진법 및 자동 반전
        StringBuilder sb = new StringBuilder();
        
        while(n>0) {
            sb.append(n%3);
            n = n/3;
        }
        

        //3진법 -> 10진법
        int answer = 0;
        
        for (int i = 0; i < sb.toString().length(); i++) {

            answer += sb.charAt(i) -'0';
            if (i==sb.toString().length()-1) {
                break;
            }
            answer = answer * 3;
        }
        
        return answer;
    }
}