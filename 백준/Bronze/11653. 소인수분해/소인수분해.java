import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();
        
        if (n==1) {
            return;
        }
        
        int div = 2;
        StringBuilder sb = new StringBuilder();
        while (true) {
            
            if (n==1) {
                break;
            }
            
            if (n%div == 0) {
                sb.append(div).append("\n");
                n = n / div;
            }
            else {
                div++;
            }
        }
        System.out.print(sb);
    }
}