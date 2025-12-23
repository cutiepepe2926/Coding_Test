import java.io.*;

public class Main {
    
    static int callNum = 0;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < t; i++) {
            callNum = 0;
            String s = br.readLine();
            sb.append(isPalindrome(s)).append(" ").append(callNum).append("\n");
        }
        System.out.println(sb);
    }
    
    static int isPalindrome(String s) {
        return recursion(s, 0, s.length()-1);
    }
    
    static int recursion(String s, int l, int r) {
        callNum++;
        if (l >= r) return 1;
        else if (s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
}