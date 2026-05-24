class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder sb = new StringBuilder();

        // 공백 및 알파벳과 숫자를 제외한 문제 제거
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' || 
                s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || 
                s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
        }

        String palin = sb.toString();

        int left = 0;
        int right = palin.length() - 1;
        
        boolean result = true;

        while (left <= right) {

            if (palin.charAt(left) != palin.charAt(right)) {
                result = false;
                break;
            }
            left++;
            right--;
        }
        

        return result;

    }
}