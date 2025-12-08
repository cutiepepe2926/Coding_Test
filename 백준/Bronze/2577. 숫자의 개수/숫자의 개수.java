import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long result = 1;
        for (int i = 0; i < 3; i++) {
            result *= Long.parseLong(br.readLine());
        }
        int[] check = new int[10];
        
        String s = String.valueOf(result);
        
        for (int i = 0; i < s.length(); i++) {
            check[s.charAt(i) - '0']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i : check) {
            sb.append(i+"\n");
        }
        System.out.println(sb.toString());
    }
}