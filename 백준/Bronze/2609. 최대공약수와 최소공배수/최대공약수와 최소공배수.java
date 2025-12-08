import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        
        int g = gcd(a,b);
        sb.append(g);
        sb.append("\n");
        sb.append(a*b/g);
        
        System.out.println(sb.toString());
    }
    
    static int gcd(int x, int y) {
        if (y==0) {
            return x;
        }
        else {
            return gcd(y, x% y);
        }
    }
}