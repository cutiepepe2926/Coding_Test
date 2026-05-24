class Solution {
    public boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            while (left < right && !checkCase(s.charAt(left))) {
                left++;
            }

             while (left < right && !checkCase(s.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;

        }

        return true;

    }

    public boolean checkCase(char c) {
        
        return (c >= 'A' && c <= 'Z' || 
                c >= 'a' && c <= 'z' || 
                c >= '0' && c <= '9');

    }

    // StringBuilder sb = new StringBuilder();

    // // 공백 및 알파벳과 숫자를 제외한 문제 제거
    // for (int i = 0; i < s.length(); i++) {
    //     if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' || 
    //         s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || 
    //         s.charAt(i) >= '0' && s.charAt(i) <= '9') {
    //         sb.append(Character.toLowerCase(s.charAt(i)));
    //     }
    // }

    // String palin = sb.toString();

    // int left = 0;
    // int right = palin.length() - 1;
    
    // boolean result = true;

    // while (left <= right) {

    //     if (palin.charAt(left) != palin.charAt(right)) {
    //         result = false;
    //         break;
    //     }
    //     left++;
    //     right--;
    // }
    

    // return result;
}