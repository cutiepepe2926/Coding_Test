class Solution {
    public String solution(String n_str) {
        StringBuilder sb = new StringBuilder();
        sb.append(n_str);
        
        boolean zero = true;
        
        for (int i=0; i<n_str.length() && zero; i++) {
            if (String.valueOf(n_str.charAt(i)).equals("0")) {
                sb.deleteCharAt(0);
            }
            else {
                zero = false;
            }
        }
        
        return sb.toString();
    }
}