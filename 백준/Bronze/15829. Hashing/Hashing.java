import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String unhash = br.readLine();
        long answer = 0;
        long r = 1;
        for (int i = 0; i < n; i++) {
            answer = (answer + (unhash.charAt(i) - 'a' + 1) * r) % 1234567891;
            r = (r * 31) % 1234567891;
        }
        System.out.println(answer);
    }
}