import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String unhash = br.readLine();
        long answer = 0;
        
        for (int i = 0; i < n; i++) {
            answer += ( unhash.charAt(i) - 'a' + 1 ) * (long)Math.pow(31, i);
        }
        System.out.println(answer);
    }
}