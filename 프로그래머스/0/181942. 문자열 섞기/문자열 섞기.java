class Solution {
    public String solution(String str1, String str2) {
        
        StringBuilder sb = new StringBuilder();
        
        int ptr1 = 0;
        int ptr2 = 0;
        
        for (int i=0; i<str1.length()+str2.length(); i++) {
            if (i%2==0) {
                sb.append(str1.charAt(ptr1));
                ptr1++;
            }
            else {
                sb.append(str2.charAt(ptr2));
                ptr2++;
            }
        }
        
        String answer = sb.toString();
        return answer;
    }
}