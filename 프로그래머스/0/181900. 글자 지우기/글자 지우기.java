class Solution {
    public String solution(String my_string, int[] indices) {
        
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<my_string.length(); i++) {
            boolean input_ok = true;
            for (int indice=0; indice<indices.length; indice++) {
                if (i==indices[indice]) {
                    input_ok = false;
                }
            }
            if (input_ok) {
                sb.append(my_string.charAt(i));
            }
        }
        
        String answer = sb.toString();
        return answer;
    }
}