class Solution {
    public String solution(String my_string, String letter) {
        String[] arr = my_string.split(letter);
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<arr.length;i++) {
            sb.append(arr[i]);
        }
        String answer = sb.toString();
        return answer;
    }
}