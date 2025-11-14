class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for (int i=0; i<quiz.length; i++) {
            
            int left = 0;
            int right = 0;
            String check = "+";
            
            String[] list = quiz[i].split(" ");
            for (int j=0; j<list.length; j++) {
                if (list[j].equals("=")) {
                    right = Integer.parseInt(list[j+1]);
                    break;
                }
                else if (list[j].equals("+")) {
                    check = "+";
                    continue;
                } 
                else if (list[j].equals("-")) {
                    check = "-";
                    continue;
                }
                else {
                    if (check.equals("+")) {
                        left = left + Integer.parseInt(list[j]);
                    }
                    else {
                        left = left - Integer.parseInt(list[j]);
                    }
                }
            }
            if (left == right) {
                answer[i] = "O";
            }
            else {
                answer[i] = "X";
            }
            
        }
        
        return answer;
    }
}