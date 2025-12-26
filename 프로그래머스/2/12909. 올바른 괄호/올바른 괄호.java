import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Deque<Character> stack = new ArrayDeque<>();
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.add('(');
            }
            else {
                if (stack.isEmpty()) {
                    answer = false;
                    break;
                }
                else {
                    stack.pop();
                }
            }
        }
        if (stack.isEmpty()) {
            return answer;
        }
        else {
            return false;
        }
    }
}