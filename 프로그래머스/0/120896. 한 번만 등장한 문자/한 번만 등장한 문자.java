import java.util.*;
class Solution {
    public String solution(String s) {
        //boolean으로?
        StringBuilder sb = new StringBuilder();
        int[] one = new int[26];
        for (int i=0; i<s.length(); i++) {
            one[s.charAt(i)-'a']++;
        }
        for (int i=0; i<one.length; i++) {
            if (one[i]==1) {
                int temp = 97+i;
                sb.append((char) temp);

            }
        }
        String answer = sb.toString();
        return answer;
    }
}