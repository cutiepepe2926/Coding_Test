class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        
        String[] answer = new String[n];
        
        for (int i = 0; i < n; i++) {
            String a1 = numToBinary(arr1[i], n);
            String a2 = numToBinary(arr2[i], n);
            answer[i] = compareBoth(a1, a2);
        }
        
        return answer;
    }
    
    public String numToBinary(int n, int length) {
        
        StringBuilder sb = new StringBuilder();
        
        while(n>0) {
            sb.append(n%2);
            n /=2;
        }
        
        
        while (sb.toString().length() < length) {
            sb.append("0");
        }
        
        return sb.reverse().toString();
    }
    
    public String compareBoth(String a, String b) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i)-'0'==1 || b.charAt(i)-'0'==1) {
                sb.append("#");
            }
            else {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}