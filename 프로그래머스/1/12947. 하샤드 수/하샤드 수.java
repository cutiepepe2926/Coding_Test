class Solution {
    public boolean solution(int x) {
        
        String sx = String.valueOf(x);
        
        int hashad = 0;
        
        for (int i = 0; i < sx.length(); i++) {
            hashad += sx.charAt(i) - '0';
        }
        
        return (x%hashad==0)?true:false;
    }
}