class Solution {
    public int solution(int num, int k) {
        String list = String.valueOf(num);
        String find = String.valueOf(k);
        
        for (int i=0; i<list.length(); i++) {
            if(String.valueOf(list.charAt(i)).equals(find)) {
                return i+1;
            }
        }
        return -1;
    }
}