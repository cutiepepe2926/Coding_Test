import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int num = gcd(a,b);
            sb.append(a*b/num).append("\n");
        }
        
        System.out.println(sb);
        
    }
    
    public static int gcd(int x, int y) {
        if (y==0) {
            return x;
        }
        else {
            return gcd(y, x%y);
        }
    }
    
}