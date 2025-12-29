import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        int up = 1;
        int down = 1;
        
        for (int i = n; i > k; i--) {
            up *= i;
        }
        
        for (int j = n - k; j > 0; j--) {
            down *= j;
        }
        
        System.out.println(up/down);
    }
}