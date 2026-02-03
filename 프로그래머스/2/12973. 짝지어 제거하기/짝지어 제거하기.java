import java.util.*;

class Solution {
    public int solution(String s) {
        
        // 스택으로 풀어볼까용?
        
        ArrayDeque<Character> stack = new ArrayDeque<>();
        
        for (int i = 0; i < s.length(); i++) {
        
            if (stack.isEmpty() || stack.peekLast() != s.charAt(i)) {
                stack.add(s.charAt(i));
                continue;
            }
            if (stack.peekLast() == s.charAt(i)) {
                stack.pollLast();
                continue;
            }
        }
        
        return (stack.isEmpty())?1:0;
        
    }
}