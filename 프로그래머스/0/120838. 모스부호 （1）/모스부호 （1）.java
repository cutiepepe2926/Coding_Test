import java.util.*;

class Solution {
    public String solution(String letter) {
        
        String[] morse = {
            ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
            "-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-",
            "..-","...-", ".--","-..-","-.--","--.."
        };

        Map<String, Character> morseToAlpha = new HashMap<>();
        
        for (int i = 0; i < 26; i++) {
            morseToAlpha.put(morse[i], (char) ('a' + i));
        }

        StringBuilder sb = new StringBuilder();
        for (String code : letter.trim().split(" ")) {
            sb.append(morseToAlpha.get(code));
        }
        return sb.toString();
    }
}