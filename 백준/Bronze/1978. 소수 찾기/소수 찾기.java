import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (num % 2==0 && num != 2) {
                continue;
            }
            if (num==1) {
                continue;
            }
            if (num==2) {
                cnt++;
                continue;
            }
            boolean prime = true;
            for (int j = 3; j < num; j+=2) {
                if (num % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) cnt++;
        }
        
        System.out.println(cnt);
    }
}